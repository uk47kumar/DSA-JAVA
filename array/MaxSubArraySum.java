package com.array;

public class MaxSubArraySum {

    public static void printSub(int numbers[]){
//        int totalSubArray = 0;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum =0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k]+" ");
                    currentSum+=numbers[k];
                }
//                totalSubArray++;
                System.out.println("current sum: "+currentSum);
                if(maxSum<currentSum){
                    maxSum = currentSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The maximum sum of sub arrays are: "+ maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSub(numbers);
    }
}
