/*Perfect Number
a. Just like the Armstrong number, the Perfect Number is also a special type of
positive number. When the number is equal to the sum of its positive divisors
excluding the number, it is called a Perfect Number. For example, 28 is the perfect
number because when we sum the divisors of 28, it will result in the same number.
The divisors of 28 are 1, 2, 4, 7, and 14. So,
b. 28 = 1+2+4+7
c. 28 = 28*/

package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
    static boolean isPerfect(int n)
    {
        if (n == 1)
        return false;

        int sum = 1;

        for (int i = 2; i * i <= n ; i++) {

            if (n % i == 0) {
                if (i * i == n)
                    sum += i;
                else
                    sum += i + (n / i);
            }
        }

        if (sum == n)

            return true;

        return false;
    }


    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check whether its a perfect number or not");
        int n = s.nextInt();

        if (isPerfect(n))
            System.out.println(n + " is a perfect number");
        else
            System.out.println(
                    n + " is not a perfect number");
    }
}
