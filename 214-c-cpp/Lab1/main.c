/* Making change program using Canadian currency that calculates the amount
 * to be returned based on users inputing a total cost and amount tendered
 * 
 * Author: Nathan Mackenzie
 * Created on January 12, 2018, 10:33 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
/*
 * main method to do the calculations and return result
 */
int main(void) {
    
    double price, tendered, changeDue, roundedChangeDue;
    int numOfChangeItems = 0;
    /* Ask for input from user */
    printf("Enter the amount of the purchase: ");
    scanf("%lf", &price);
    
    printf("Enter the amount tendered: ");
    scanf("%lf", &tendered);
    
    changeDue = tendered - price;
    roundedChangeDue = round(changeDue * 20.0) / 20.0;
    printf("Change due is $%.2lf", price);
    printf("\nRounded to the nearest nickel $%.2lf", roundedChangeDue);
    
    /* Calculate and display types and number of bills and coins back */
    numOfChangeItems = roundedChangeDue / 20;
    if (numOfChangeItems > 0) {
        printf("\n%d Twenties", numOfChangeItems);
        roundedChangeDue = roundedChangeDue - (numOfChangeItems * 20);
    } 
    numOfChangeItems = roundedChangeDue / 10;
    if (numOfChangeItems > 0) {
        printf("\n%d Tens", numOfChangeItems);
        roundedChangeDue = roundedChangeDue - (numOfChangeItems * 10);
    } 
    numOfChangeItems = roundedChangeDue / 5;
    if (numOfChangeItems > 0) {
        printf("\n%d Fives", numOfChangeItems);
        roundedChangeDue = roundedChangeDue - (numOfChangeItems * 5);
    } 
    numOfChangeItems = roundedChangeDue / 2;
    if (numOfChangeItems > 0) {
        printf("\n%d Toonies", numOfChangeItems);
        roundedChangeDue = roundedChangeDue - (numOfChangeItems * 2);
    } 
    numOfChangeItems = roundedChangeDue / 1;
    if (numOfChangeItems > 0) {
        printf("\n%d Loonies", numOfChangeItems);
        roundedChangeDue = roundedChangeDue - (numOfChangeItems * 1);
    }             
    numOfChangeItems = roundedChangeDue / 0.25;
    if (numOfChangeItems > 0) {
        printf("\n%d Quarters", numOfChangeItems);
        roundedChangeDue = roundedChangeDue - (numOfChangeItems * 0.25);
    }
    numOfChangeItems = roundedChangeDue / 0.10;
    if (numOfChangeItems > 0) {
        printf("\n%d Dimes", numOfChangeItems);
        roundedChangeDue = roundedChangeDue - (numOfChangeItems * 0.10);
    } 
    numOfChangeItems = roundedChangeDue / 0.05;
    if (numOfChangeItems > 0) {
        printf("\n%d Nickels", numOfChangeItems);
        roundedChangeDue = roundedChangeDue - (numOfChangeItems * 0.05);
    } 
    
    return (EXIT_SUCCESS);
}

