package com.bridgelabz.basic_programs;

import java.util.Scanner;

public class BasicProblems {
    public static void main(String[] args) {
        BasicProblems basicProblems = new BasicProblems();
        int noOfTimesCoinToFlip = 10450;
        basicProblems.getPercentageOfHeadTail(noOfTimesCoinToFlip);
        System.out.println("========================================");
        int year = 2000;
        basicProblems.checkForLeapYear(year);
        System.out.println("========================================");
        System.out.println("Enter the number to get power of two value");
        int number = new Scanner(System.in).nextInt();
        basicProblems.getPowerOfTwo(number);
        System.out.println("========================================");
        int harmonicNo = 15;
        basicProblems.getNthHarmonicNo(harmonicNo);
        System.out.println("========================================");
        basicProblems.getPrimeFactors(335);
        System.out.println("========================================");
        basicProblems.computeQuotientRemainder(15,4);
        System.out.println("========================================");
        basicProblems.swappingOfTwoNos(12,15);
        System.out.println("========================================");
        basicProblems.checkNoEvenOrOdd(12);
    }

    void checkNoEvenOrOdd(int no) {
        if (no % 2 == 0)
            System.out.println(no + " is even number");
        else
            System.out.println(no + " is odd number");
    }

    void swappingOfTwoNos(int numOne, int numTwo) {
        System.out.println("Numbers before swapping: No 1 is " + numOne + " No 2 is " + numTwo);
        int temp = numOne;
        numOne = numTwo;
        numTwo = temp;
        System.out.println("Numbers before swapping: No 1 is " + numOne + " No 2 is " + numTwo);
    }

    void computeQuotientRemainder(int noOne, int noTwo) {
        System.out.println("Quotient is: " + noOne / noTwo);
        System.out.println("Remainder is: " + noOne % noTwo);
    }

    void getPrimeFactors(int number) {
        System.out.println("Prime factors of number " + number + " are");
        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number /= i;
            }

        }

        if (number > 1)
        System.out.println(number);

    }

    void getNthHarmonicNo(int harmonicNo) {
        float sum = 0;
        for (int i = 1; i <= harmonicNo; i++) {
            sum = sum + (float) 1 / i;
        }

        System.out.println(harmonicNo + "th Harmonic no is: " + sum);
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