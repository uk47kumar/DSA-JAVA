package com.normalcoading;

public class SecondHighest {

    private static int findSecondLargest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }

    public static void main(String[] args) {
        int [] array = {3,2,5,6,9};
        System.out.println(findSecondLargest(array));
    }
}
