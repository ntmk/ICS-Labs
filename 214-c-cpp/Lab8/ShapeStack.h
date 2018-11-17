/*
 * A linked implementation of a stack that can be used to store Shape objects
 *
 * File:   Stack.h
 * Author: dale
 *
 * Created on November 14, 2011, 5:54 PM
 */

#ifndef SHAPESTACK_H
#define SHAPESTACK_H

#include <cstdlib>
#include "Shape.h"
#include "StackException.h"

class ShapeStack {
private:
    // The node that will be used for the Stack

    typedef struct stackNode {
        struct stackNode *next;
        Shape *theShape;
    } StackNode;

    /** A pointer to the StackNode at the top of the stack */
    StackNode *topItem;
    /** The number of Shapes currently on the stack */
    int count;
public:

    /** Constructor initializes the data members */
    inline ShapeStack() : topItem(NULL), count(0) {
    }

    /**
     * Push a Shape onto the stack
     *
     * @param shape Pointer to the Shape to be stored
     */
    void push(Shape *shape) {
        StackNode *current = new StackNode;
        current->theShape = shape;
        current->next = topItem;
        topItem = current;
        count++;
    }

    /**
     * Remove a Shape from the stack
     *
     * @throw A StackException if the stack is empty
     * @return A pointer to the Shape
     */
    Shape* pop(void) throw (StackException) {
        if (topItem != NULL) {
            StackNode *current = new StackNode;
            current = topItem;
            topItem = current->next;
            Shape *shape = current->theShape;
            delete(current);
            count--;
            return shape;
        } else {
            throw StackException("The stack has nothing to remove.");
        }
    }

    /**
     * Peek at the Shape at the top of the stack
     *
     * @throw A StackException if the stack is empty
     * @return
     */
    Shape* top(void) throw (StackException) {
        if (topItem != NULL) {
            return topItem->theShape;
        } else {
            throw StackException("The stack is empty.");
        }
    }

    /**
     * The number of Shapes currently on the stack
     * @return That number
     */
    inline int size(void) {
        return count;
    }

    /**
     * Query if the stack is empty
     *
     * @return true if the stack is empty
     */
    inline bool isEmpty(void) {
        return count == 0;
    }
};


#endif /* STACK_H */
