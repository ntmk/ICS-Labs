/*
 * A main() to demonstrate inheritance, polymorphism, virtual functions,
 * and an abstract class.
 * Uses classes: Shape, Rectangle, and Circle.
 * 
 * File:   main.cpp
 * Author: dale
 *
 * Created on November 7, 2011, 2:27 PM
 */

#include <cstdlib>
#include "Rectangle.h"
#include "Circle.h"
#include "Square.h"
#include "ShapeStack.h"
using namespace std;

int main(void) {
    Circle c1(20.5, 4, 10);
    Rectangle r1(10, 20.7, 8, 8);
    Circle c2(11, 10, 5);
    Square s1(2, 0, 1);
    try {
        ShapeStack error = ShapeStack();
        error.top();
    } catch (StackException& e) {
        cout << e.getMessage() << endl;
    }
    
     try {
        ShapeStack error = ShapeStack();
        error.pop();
    } catch (StackException& e) {
        cout << e.getMessage() << endl;
    }
    
    try {
        
        ShapeStack stack = ShapeStack();
        stack.push(&c1);
        stack.push(&r1);
        stack.push(&c2);
        stack.push(&s1);


        
        while (!stack.isEmpty()) {
            stack.pop()->draw();
        }
    } catch (StackException& e) {
        cout << e.getMessage();
    }

    return EXIT_SUCCESS;
}
