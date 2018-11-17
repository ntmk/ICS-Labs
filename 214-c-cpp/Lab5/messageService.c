/*
 * A message storage service that allocates space on demand from a limited
 * pool of chained buffers.
 * Intended for systems that require efficiency and have limited resources.
 *
 * The buffer pool free list is maintained using an array-based circular queue
 * using a mask for modulo indexing.
 *
 * Author: Nathan Mackenzie
 * File:   messageService.c
 *
 * Feb 20 2018
 */
#include <stdio.h>
#include <string.h>
#include "messageService.h"

static LinkType blocksHead; // Circular queue index for first available block
static LinkType blocksTail; // Circular queue index for last available block
static LinkType blocksFree[N_MESSAGE_BLOCKS]; // Free list is a circular queue
// For each block, the link to the next block (-1 indicates no next block)
static LinkType links[N_MESSAGE_BLOCKS];
static int blocksAvailable; // Current number of free blocks
static char messageBlocksInitialized = 0;
// Allocate the array of blocks
static char messageBlocks[N_MESSAGE_BLOCKS][MESSAGE_BLOCK_SIZE];
//blocksHead = (++blocksHead)&message_block_mask;

/*
 * Get one free Message Block
 *
 * @return Block index if successful. -1 otherwise.
 */
static LinkType getBlock() {
   if (blocksAvailable == 0) {
        return -1;
    }
    blocksAvailable--;
    LinkType tempBlock = blocksFree[blocksHead];
    blocksHead++;
    blocksHead &= N_MESSAGE_BLOCKS_MASK;
    return tempBlock;
}

/**
 * Copies a message from an array of chars (bytes) into a newly-allocated
 * set of buffers.
 *
 * @param myMessage A pointer to the first byte of data to be copied
 * @param nBytes The number of bytes to be copied
 *
 * @return A struct containing the Message
 */
Message createMessage(const char *myMessage, const int nBytes) {
    if (!messageBlocksInitialized) {
        initializeMessageBlocks();
    }

    Message retVal;
    retVal.nBytes = nBytes;

    // Division by a power of 2 is simply a shift
    int blocksNeeded = nBytes >> (MESSAGE_BLOCK_BITS);
    // Need one more if there is a remainder
    if (nBytes & MESSAGE_BLOCK_MASK) {
        ++blocksNeeded;
    }

    if (blocksNeeded > blocksAvailable) {
        retVal.nBytes = -1;   // Mark as invalid Message
        return retVal;
    }

    LinkType firstBlock = getBlock();
    LinkType thisBlock = firstBlock;

    retVal.firstBlock = firstBlock;

    DPRINT("Need %d. Using blocks: ", blocksNeeded);
// Go into a loop to copy data into each block and link the blocks
    int charCounter = 0;
    for (int getCharAt = 0; getCharAt < retVal.nBytes; getCharAt++) {
        //copy memory over
        if (charCounter == MESSAGE_BLOCK_SIZE) {
            charCounter = 0;
            LinkType tempBlock = thisBlock;
            thisBlock = getBlock();
            links[tempBlock] = thisBlock;
            DPRINT("    %hu", thisBlock);
        }
        
        messageBlocks[thisBlock][charCounter] = myMessage[getCharAt];
        charCounter++;

    }
    links[thisBlock] = -1;\
    DPRINT("\nblocksHead %hu\n", blocksHead);
    return retVal;
}

/**
 * Returns all buffers used by a Message to the buffer pool.
 *
 * @param The Message to be freed
 */
void freeMessage(Message message)  {
    LinkType thisBlock = message.firstBlock;
    int nBytes = message.nBytes;
    DPRINT("Freeing blocks:");
    
    while (nBytes > 0) {
        
        DPRINT("    %hu", thisBlock);
        blocksTail++;
        blocksTail &= N_MESSAGE_BLOCKS_MASK;
        blocksFree[blocksTail] = thisBlock;
        blocksAvailable++;

        if (links[thisBlock] != -1) {
            thisBlock = links[thisBlock];
            nBytes -= MESSAGE_BLOCK_SIZE;
        } else {
            nBytes = 0;
        }
    }
    DPRINT("\nblocksTail %hu\n", blocksTail);
}

/**
 * Initializes the entire set of data structures for the buffer pool system.
 */
void initializeMessageBlocks(void) {
    for (int k = 0; k < N_MESSAGE_BLOCKS; k++) {
        blocksFree[k] = k;
    }
    blocksHead = 0;
    blocksTail = N_MESSAGE_BLOCKS - 1;
    blocksAvailable = N_MESSAGE_BLOCKS;
    messageBlocksInitialized = 1;
}

/**
 * Returns the number of buffers that are available in the pool.
 * A convenience function that is not needed for using the Message Service.
 *
 * @return The number of free buffers
 */
int numberOfFreeBuffers(void) {
    return blocksAvailable;
}

/**
 * Prints the bytes contained in the Message as a character string to stdout.
 *
 * @param message The Message to be printed
 */
void printMessage(FILE *stream, const Message message) {
    LinkType thisBlock = message.firstBlock;
    int nBytes = message.nBytes;
    while (thisBlock >=0) {
        int n = (nBytes >= MESSAGE_BLOCK_SIZE)?MESSAGE_BLOCK_SIZE:nBytes;
        fwrite(messageBlocks[thisBlock], 1, n, stream);
        nBytes -= n;
        thisBlock = links[thisBlock];
    }
}
