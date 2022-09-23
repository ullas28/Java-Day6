/*Fibonacci Series
Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1).*/

package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class FibonacciSeries {
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
        int counter = 0;

        while (counter < N) {

            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range for Fibonacci series");
        int N = s.nextInt();
        Fibonacci(N);
    }
    }

