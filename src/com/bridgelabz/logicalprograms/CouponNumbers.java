/*Coupon Numbers a. Desc -> Given N distinct Coupon Numbers, how many random numbers do you
need to generate a distinct coupon number? This program simulates this random process.
b. I/P -> N Distinct Coupon Number
c. Logic -> repeatedly choose a random number and check whether it's a new one.
d. O/P -> total random number needed to have all distinct numbers.
e. Functions => Write Class Static Functions to generate random numbers and to
process distinct coupons.*/

package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class CouponNumbers {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of coupons:");
        int n = scn.nextInt();
        char[] s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        System.out.println(s[1]);

        for (int i = 0; i < n; i++) {
            int max = 999999999;
            int random = (int) (Math.random() * max);
            System.out.println(random);
            StringBuffer sb = new StringBuffer();
            while (random > 0) {
                sb.append(s[random % s.length]);
                random /= s.length;
            }

            String CouponCode = sb.toString();
            System.out.println("Coupon Code: " + CouponCode);
        }
    }
}
