/* 
 * File:   main.cpp
 * Author: Nathan
 * 
 * Small program to 
 * Created on February 27, 2018, 1:54 PM
 */

#include <cstdlib>
#include <string>
#include <iostream>
#include <iomanip>
#include <cmath>
#include "makeChange.h"
#include "NegativeValueException.h"

using namespace std;
static const int NUM = 8;
static const Currency myArray[NUM] = {
    {20.00,  "twenty", "twenties"},
    {10.00, "ten", "tens"},
    {05.00, "five", "fives"},
    {02.00, "twoonie", "twoonies"},
    {01.00, "loonie", "loonies"},
    {00.25, "quarter", "quarters"},
    {00.10, "dime", "dimes"},
    {00.05, "nickle", "nickles"}
};

/* 
 * prompt the user for an amount if user enters negative value throw exception 
 */
double getMoneyValue(string prompt) throw (NegativeValueException) {
    double value = 0;
    cout << prompt;
    cin >> value;
    if (value >= 0) {
        cout << "The entered amount is " << value;
    } else {
        NegativeValueException err;
        throw err;
    }
}

/* 
 * calculate the denomination of each value and update the balance due
 */
ChangeValue makeChange(double balance, double denominationValue) {
    ChangeValue change;
    change.value = double(int(balance * 100 + 0.5)) / 100 / denominationValue;
    change.balance = balance - (denominationValue * change.value);
    return change;
}

/*
 *  Prompt user for dollar amounts for total purchase price tendered amount
 *  then return the amount of change with denominations
 */
int main(void) {
    try {
        double purchase = getMoneyValue("Enter purchase amount:  ");
        double tendered = getMoneyValue("\nEnter the amount tendered:  ");
        while (tendered < purchase) {
            tendered += getMoneyValue("\nEnter the amount tendered:  ");
        }

        double changeDue = tendered - purchase;

        double roundedChangeDue = round(changeDue * 20.0) / 20.0;

        cout << "\nThe change due is: " << roundedChangeDue << endl;

        ChangeValue mychange;
        mychange.balance = roundedChangeDue;
        for (int i = 0; i < NUM; i++) {
            mychange = makeChange(mychange.balance, myArray[i].value);
                if (mychange.value == 1) {
                    cout << mychange.value << " " << myArray[i].name << "\n";
                } else if (mychange.value > 1) {
                    cout << mychange.value << " " << myArray[i].pluralName << "\n";
                }
        }
    } catch (NegativeValueException& err) {
        cout << err.what();
    }
    return EXIT_SUCCESS;
}

