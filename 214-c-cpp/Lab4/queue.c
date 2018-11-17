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

/* Add an item to the rear of the dynamically-allocated queue.
 * Returns:  pointer to the item if successful, NULL if not */
ItemType *enqueueR(Queue *queue, ItemType *item) {
    ListNode *newNode = (ListNode *) malloc(sizeof (ListNode));
    newNode->item = item;
    newNode->next = NULL;
    if (queue->front == NULL) {
        queue->front = queue->rear = newNode;
    } else {
        queue->rear->next = newNode;
        queue->rear = newNode;
    }
    queue.size++;
    return newNode->item;
}

/* Add an item to the front of the dynamically-allocated queue.
 * Returns:  pointer to the item if successful, NULL if not */
ItemType *enqueueF(Queue *queue, ItemType *item) {
    ListNode *newNode = (ListNode *) malloc(sizeof (ListNode));
    newNode->item = item;
    newNode->next = NULL;
    if (queue->front == NULL) {
        queue->front = queue->rear = newNode;
    } else {
        newNode->next = queue->front;
        queue->front = newNode;
    }
    queue.size++;
    return newNode->item;
}

/* Removes an item from the front of the queue.
 * Returns:  pointer to the item if successful, NULL if empty */
ItemType *dequeueF(Queue *queue) {
    if (queue->front == NULL) {
        return NULL;
    }
    ListNode *frontNode = queue->front;
    ItemType *item = frontNode->item;
    queue->front = queue->front->next;
    free(frontNode);
    queue.size--;
    return item;
}

/* Removes an item from the rear of the queue.
 * Returns:  pointer to the item if successful, NULL if empty */
ItemType *dequeueR(Queue *queue) {
    if (queue->rear == NULL) {
        return NULL;
    }
    ListNode *tempNode = NULL;
    ListNode *curNode = queue->front;
    while (curNode->next != NULL) {
        tempNode = curNode;
        curNode = curNode->next;
    }
    ItemType *item = curNode->item;
    free(curNode);
    tempNode->next = NULL;
    queue->rear = tempNode;
    queue.size--;
    return item;
}

/* Returns:  number of items in the queue */
int queueSize(const Queue queue) {
    return queue.size;
}

/* Print the contents of the queue to the specified stream */
void printQueue(const Queue queue, FILE *stream) {
    if (queue.front == NULL) {
        fprintf(stream, "The queue is empty");
    } else {
        ListNode *frontNode = queue.front;
        while (frontNode != NULL) {
            fprintf(stream, "%d\n", *(frontNode)->item);
            frontNode = frontNode->next;
        }
    }
}