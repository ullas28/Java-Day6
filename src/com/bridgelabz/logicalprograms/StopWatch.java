/*Simulate Stopwatch Program
a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
the start and end clicks
b. I/P -> Start the Stopwatch and End the Stopwatch
c. Logic -> Measure the elapsed time between start and end
d. O/P -> Print the elapsed time.*/

package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {

    public static void main(String[] args) {

        long start = 0, stop = 0;

        Scanner s = new Scanner(System.in);

        while(true) {
            System.out.println("1. Start StopWatch \n2. Stop StopWatch \n3. Exit");

            System.out.println("Enter your Choice :");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    start = System.nanoTime();
                    System.out.println("Start Time :" + start);
                    break;
                case 2:
                    stop = System.nanoTime();
                    long sec = ((stop - start) / 1000000000);
                    System.out.println("end Time :" + stop);
                    int min = (int) sec / 60;
                    int hr = min / 60;
                    System.out.println("Elapsed Time is " + hr + ":" + min + ":" + sec);
                    break;
            }

            if(choice >= 3) {
                System.out.println("Closing the Stopwatch.");
                break;

            }
        }
    }
}
