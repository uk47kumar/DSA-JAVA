package com.array;

public class PrefixArray {

    public static void maxSubArray(int numbers[]){
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0]=numbers[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]= prefix[i-1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = 0; j < numbers.length; j++) {
                int end = j;
                // getting the value of current sum using prefix and check condition if start is 0 or not
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maximumSum<currentSum){
                    maximumSum=currentSum;
                }
            }
        }
        System.out.println(maximumSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        maxSubArray(numbers);
    }
}
