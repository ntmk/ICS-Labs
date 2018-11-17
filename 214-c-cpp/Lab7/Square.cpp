

/* 
 * File:   Square.cpp
 * Author: Nathan
 * 
 * Created on March 7, 2018, 10:54 AM
 */

#include "Square.h"

void Square::draw() const {
    std::cout << "Square of size [" << getSide()  << "] drawn at " << getX() << " " << getY() << std::endl;
}

void Square::printMe(std::ostream& os) const {
    os << "Square of size [" << getSide() << "] at " << getX() << " " << getY();
}

