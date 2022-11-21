package com.array;

public class KadanesMaxSum {

    public static void kadanse(int numbers[]){
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum<0){
                currentSum=0;
            }
            maximumSum = Math.max(maximumSum,currentSum);
        }
        System.out.println(maximumSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanse(numbers);
    }
}
