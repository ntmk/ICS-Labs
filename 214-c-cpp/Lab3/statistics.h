/*
 * File:   statistics.h
 * Author: Nathan
 *
 * Created on January 26, 2018, 1:08 PM
 */

#ifndef STATISTICS_H
#define STATISTICS_H
         
#include <stdio.h>
         
double mean(double, int);
double ssdev(double, double, int);
void printStats(FILE *dest, const int count, const double mean, const double ssdev);

#endif /* STATISTICS_H */

