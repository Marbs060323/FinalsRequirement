Purpose:
This program calculates the exponential function e^x for each value of x provided in an input file. It uses the Taylor series expansion to approximate the exponential function.

Approach:
1. Read input values of x from a text file.
2. For each input value, calculate e^x using the Taylor series expansion.
3. Output the result to the console.

Assumptions:
- The input file contains one value of x per line.
- The input values are valid decimal numbers.
- The precision of the calculation is set to 50 decimal places.
- The number of iterations in the Taylor series expansion is limited to 100 for precision. 

Instructions:

Compile the Program:
javac LaniogMarvinMidtermReq.java

Run the Program:
java LaniogMarvinMidtermReq

Input File Format (Decimal.txt):
Each line should contain a single decimal number representing the value of x.

Output:
The result for each x value will be printed to the console in the format: "e^x = result".