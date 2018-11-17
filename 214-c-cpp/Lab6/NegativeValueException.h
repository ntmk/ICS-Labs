/* 
 * File:   NegativeValueException.h
 * Author: Nathan
 *
 * Created on March 5, 2018, 1:35 PM
 */

#ifndef NEGATIVEVALUEEXCEPTION_H
#define NEGATIVEVALUEEXCEPTION_H
#include <iostream>
#include <exception>

using namespace std;

class NegativeValueException: public exception{
public:
  virtual const char* what() const throw() {
    return "Negative values are not allowed";
  }
};

#endif /* NEGATIVEVALUEEXCEPTION_H */

