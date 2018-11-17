/*
 * A main() to demonstrate inheritance, polymorphism, virtual functions,
 * and an abstract class.
 * Uses classes: Shape, Rectangle, and Circle.
 * 
 * File:   main.cpp
 * Author: Nathan
 *
 * Created on November 7, 2011, 2:27 PM
 */

#include <cstdlib>
#include <vector>
#include "Rectangle.h"
#include "Circle.h"
#include "Square.h"
#include "ShapeStack.h"
#include <algorithm>

using namespace std;

int main(void) {
    Circle c1(20.5, 4, 10);
    Rectangle r1(10, 20.7, 8, 8);
    Circle c2(11, 10, 5);
    Square s1(2, 0, 1);

    vector<Shape*> v;

    cout << "Size: " << int(v.size()) << endl;

    v.push_back(&c2);
    v.push_back(&c1);
    v.push_back(&r1);

    cout << "Capacity: " << int(v.capacity()) << endl;

    cout << "Max Size: " << v.max_size() << endl;

    cout << "Front shape: " << *(v.front()) << endl;

    cout << "Back shape: " << *(v.back()) << endl;

    v.insert(v.begin(), &s1);

    cout << "First item is now: " << *(v[0]) << endl;

    v.pop_back();

    cout << "Back is now: " << *(v.back()) << endl;

    cout << "Shape at postion 3: " << *(v.at(2)) << endl;

    vector <Shape*> ::iterator itf = v.begin();
    vector <Shape*> ::iterator itr = v.end();
    for (   ; itf != itr; itf++) {
        cout << **itf << endl;
    }
   
    try {
        v.at(9);

    } catch (out_of_range& err) {
        cout << err.what() << endl;
    }




    return EXIT_SUCCESS;
}
