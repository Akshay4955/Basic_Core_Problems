package com.bridgelabz.basic_programs;

import java.util.Scanner;

public class BasicProblems {
    public static void main(String[] args) {
        int noOfTimesCoinToFlip = 10450;
        BasicProblems basicProblems = new BasicProblems();
        basicProblems.getPercentageOfHeadTail(noOfTimesCoinToFlip);
        int year = 2000;
        basicProblems.checkForLeapYear(year);
        System.out.println("Enter the number to get power of two value");
        int number = new Scanner(System.in).nextInt();
        basicProblems.getPowerOfTwo(number);
    }

    void getPowerOfTwo(int number) {
        int valueOfPower = 1;
        for (int i = 1; i <= number; i++) {
            valueOfPower = valueOfPower * 2;
            System.out.println("Table for power of 2 is: " + valueOfPower);
        }

    }

    void checkForLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " year is a leap year");
                } else {
                    System.out.println(year + " year is not a leap year");
                }

            } else {
                System.out.println(year + " year is a Leap Year");
            }

        } else {
            System.out.println(year + " year is not a Leap Year");
        }

    }

    void getPercentageOfHeadTail(int noOfTimesCoinToFlip) {
        int tailCount = 0, headCount = 0;
        for (int i = 1; i <= noOfTimesCoinToFlip; i++) {
            double result = Math.random();
            if (result < 0.5)
                tailCount++;
            else
                headCount++;
        }

        System.out.println("Tail Percentage is equal to : " + (float) Math.floor(tailCount * 100) / noOfTimesCoinToFlip + "%");
        System.out.println("Head Percentage is equal to : " + (float) Math.floor(headCount * 100) / noOfTimesCoinToFlip + "%");
    }
}