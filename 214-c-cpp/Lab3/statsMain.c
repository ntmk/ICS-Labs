/*
 * A program to compute statistics from a file of ascii numbers.
 */

/* 
 * Author: Nathan
 * Created on January 23, 2018, 8:25 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "statistics.h"
#include <string.h>

/*
 * 
 */
int main(int argc, char** argv) {
    /* declaring file pointer to keep track of the file being used */
    FILE *file;

    if (argc < 2) {
        fprintf(stderr, "Usage: %s fileName\n", argv[0]);
        return (EXIT_FAILURE);
    }
    if ((file = fopen(argv[1], "r")) == NULL) {
        fprintf(stderr, "%s: Unable to open %s\n", argv[0], argv[1]);
        return (EXIT_FAILURE);
    }

    int count = 0;
    double sum=0.0, num, sumsq=0.0;
    while (fscanf(file, "%lf", &num) == 1) {
        count += 1;
        sum += num;
        sumsq += pow(num, 2);
    }
    fclose(file);
    
    if (count < 2) {
        fprintf(stderr, "There was not enough values found in the file %s\n", argv[1]);
        return (EXIT_FAILURE);
    }

    double m = mean(sum, count);

    double sd = ssdev(sum, sumsq, count);

    printStats(stdout, count, m, sd);

    //    =======================================================================
    const char *prefix = "Result_";
    int len = strlen(prefix) + strlen(argv[1]);
    char *outName = malloc(len + 1);
    strncpy(outName, prefix, len);
    strncat(outName, argv[1], len - strlen(prefix));
     
    //    Writes a file with the results
    FILE *outFile;
    if ((outFile = fopen(outName, "w")) == NULL) {
        fprintf(stderr, "%s: Unable to open %s\n", argv[0], argv[1]);
        return (EXIT_FAILURE);
    }

    printStats(outFile, count, m, sd);

    fclose(outFile);
    //    =======================================================================

    return (EXIT_SUCCESS);
}

void printStats(FILE *dest, const int count, const double mean, const double ssdev) {
    printf("%d Values, Mean = %lf, Standard Deviation = %lf\n", count, mean, ssdev);
}