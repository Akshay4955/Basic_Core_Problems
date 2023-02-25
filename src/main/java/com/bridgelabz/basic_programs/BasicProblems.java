package com.bridgelabz.basic_programs;

public class BasicProblems {
    public static void main(String[] args) {
        int noOfTimesCoinToFlip = 10450;
        BasicProblems basicProblems = new BasicProblems();
        basicProblems.getPercentageOfHeadTail(noOfTimesCoinToFlip);
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