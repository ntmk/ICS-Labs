#include <math.h>
#include "statistics.h"
/*
 * Compute mean from sum and count
 */
double mean(const double sum, const int count) {
    double mean = sum / count;
    return mean;
}

/*
 * Compute sample standard deviation from sum, sum of squares, and count
 */
double ssdev(const double sum, const double sumsq, const int count) {
    double standardDeviation = sqrt(((sumsq * count) - (pow(sum, 2)))/(count*(count-1)));
    return standardDeviation;
}