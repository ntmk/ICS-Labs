1. Declare a variable named gauge and assign to it the binary value of 0b11100111.
2. Declare a variable named mask and assign to it the binary value of  0b11000001.
3. Declare a variable named result and assign to it the bitwise AND of gauge and mask.  This AND operation will confirm that the first bit, the seventh bit, and the eighth bit are set to 1 in the gauge value.
4. Use console.log to output the value of result using the toString(2) method to show the value in binary format.
5. Use console.log to output the value of result using the toString(16) method to show the value in hexadecimal format.
6. You need to perform a bit check on gauge if the third, fifth, and seventh bits (third bit is the third from the end) are set to 1. Assign an appropriate value to mask to facilitate this bit check.
7. Assign to result the bitwise AND of gauge and mask.
8. Use console.log to output the value of result using the toString(8) method to show the value in octal format.
9. Bitwise OR uses the single vertical bar and is used to set a bit position to 1 from the mask.  Assign to mask an appropriate value that will be used to set the 1 the bit positions 2, 4, 5, and 8.
10. Assign to result the bitwise OR of gauge and mask.
11. Use console.log to output the value of result using the toString(2) method to show the value in binary format.
12. The ~ bit operator (bitwise NOT) flips the bits in an operand.  Assign to result the bitwise NOT of itself.
13. Use console.log to output the value of result using the toString(2) method to show the value in binary format.
14. Use the bitwise left shift operator (<<) to shift the result's bits by two positions.
15. Use console.log to output the value of the result using the toString(2) method to show the value in binary format.
16. Use the bitwise exclusive-OR operator (^) to assign to result the value of gauge XOR mask.
17. Use console.log to output the value of the result using the toString(2) method to show the value in binary format.