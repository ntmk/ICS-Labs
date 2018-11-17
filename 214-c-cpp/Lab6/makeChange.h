/* 
 * File:   makeChange.h
 * Author: Nathan
 *
 * Created on March 5, 2018, 1:30 PM
 */

#ifndef MAKECHANGE_H
#define MAKECHANGE_H
#include <cstring>
using namespace std;

typedef struct {
    double value;
    string name;
    string pluralName;
} Currency;

typedef struct {
    int value;
    double balance;
}ChangeValue;

#endif /* MAKECHANGE_H */

