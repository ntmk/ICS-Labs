/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Square.h
 * Author: Nathan
 *
 * Created on March 7, 2018, 10:54 AM
 */

#ifndef SQUARE_H
#define SQUARE_H
#include "Rectangle.h"
#include <iostream>

class Square : public Rectangle {

private:
    
protected:
    void printMe(std::ostream& os) const;
public:
    /**
     * This constructor passes the x,y location to the base class constructor
     * in Shape and also initializes the Rectangle's size.
     *
     * We choose to make this an inline function.
     *
     * @param l Length
     * @param l Width
     * @param xLoc Initial x coordinate
     * @param yLoc Initial y coordinate
     */
    inline Square(double side,  int x, int y)
        : Rectangle(side ,side, x, y) {
    }

    inline double getSide(void) const {
        return getWidth();
    }

    /**
     * The Rectangle "draws" itself at its current location
     */
    void draw() const;
};

#endif /* SQUARE_H */

