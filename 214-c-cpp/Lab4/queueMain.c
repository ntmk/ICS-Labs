/* 
 * Implementing a queue using a dynamically built linked list
 * 
 * File:   queueMain.c
 * Author: Nathan Mackenzie
 *
 * Created on February 5, 2018, 3:34 PM
 */
#include <stdio.h>
#include <stdlib.h>
#include "queue.h"

/* 
 * Main routine for a linked list queue that accepts user in put through choice 
 * prompts in the console and continues to run until the user enters in -1
 */
int main(int ac, char *av[]) {
    Queue queue = {NULL, NULL, 0};
    /*
     *  outer while loop ensures user enters a valid choice otherwise re prompts
     */
    int done = 0;
    while (!done) {
        int choice, nValid;
        do {
            printf("Enter 0 to remove from front of queue / Enter 1 to add to end of queue\n"
                    "Enter 2 remove from end of queue / Enter 3 to add to front of queue\n"
                    "(-1 to quit): ");
            nValid = scanf("%d", &choice);
        } while (nValid != 1 || choice < -1 || choice > 3);

        switch (choice) {
                /* 
                 * entering 0 removes the first item in the queue if an attempt is
                 * made to remove an item from the queue and its empty displays the
                 * reason otherwise confirms item was removed 
                 */
            case 0:
            {
                ItemType *item;
                if ((item = dequeueF(&queue)) != NULL) {
                    printf("Removed " ITEM_FORMAT "\n", *item);
                    free(item);
                } else {
                    printf("Queue is empty\n");
                }
                break;
            }

                /* 
                 * entering 1 adds an item to the back of the queue if an error 
                 * occurs it will be displayed to the user
                 */
            case 1:
            {
                ItemType *item = malloc(sizeof (ItemType));
                if (item == NULL) {
                    fprintf(stderr, "%s: Error allocating memory for item.\n", av[0]);
                    return EXIT_FAILURE;
                }

                printf("Enter " ITEM_PROMPT ": ");
                if (scanf(ITEM_FORMAT, item) != 1) {
                    fprintf(stderr, "Unable to read " ITEM_PROMPT "\n");
                    break;
                }

                if ((item = enqueueR(&queue, item)) != NULL) {
                    printf("Added " ITEM_FORMAT "\n", *item);
                } else {
                    fprintf(stderr, "%s: Error allocating memory to queue.\n", av[0]);
                    return EXIT_FAILURE;
                }
                break;
            }

                /* entering 2 removes the item in back of queue if an attempt is
                 * made to remove an item from the queue and its empty displays the
                 * reason otherwise confirms item was removed */
            case 2:
            {
                ItemType *item;
                if ((item = dequeueR(&queue)) != NULL) {
                    printf("Removed " ITEM_FORMAT "\n", *item);
                    free(item);
                } else {
                    printf("Queue is empty\n");
                }
                break;
            }

                /* 
                 * entering 3 adds an item to the front of the queue if an error 
                 * occurs it will be displayed to the user
                 */
            case 3:
            {
                ItemType *item = malloc(sizeof (ItemType));
                if (item == NULL) {
                    fprintf(stderr, "%s: Error allocating memory for item.\n", av[0]);
                    return EXIT_FAILURE;
                }

                printf("Enter " ITEM_PROMPT ": ");
                if (scanf(ITEM_FORMAT, item) != 1) {
                    fprintf(stderr, "Unable to read " ITEM_PROMPT "\n");
                    break;
                }

                if ((item = enqueueF(&queue, item)) != NULL) {
                    printf("Added " ITEM_FORMAT "\n", *item);
                } else {
                    fprintf(stderr, "%s: Error allocating memory to queue.\n", av[0]);
                    return EXIT_FAILURE;
                }
                break;
            }

                /* if -1 is entered the application gracefully exits */
            case -1:
            {
                done = 1;
                break;
            }


            default:
                fprintf(stderr, "Invalid choice entered");
        }
    }

    printf("Items remaining in the queue:\n");
    printQueue(queue, stdout);


    return EXIT_SUCCESS;
}
