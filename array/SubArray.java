package com.array;

public class SubArray {

    public static int addArray(int num[]){
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum+num[i];
        }
        return sum;
    }

    public static void printSubArray(int numbers[]){
        int totalSubarray = 0;
        for (int i=0; i<numbers.length; i++){

            int start = i;

            int particularSum = 0;

            for (int j=i; j< numbers.length; j++){

                int end = j;

                int sum = 0;

                for (int k=start; k<=end; k++){

                    sum = sum+numbers[k];
                    particularSum = particularSum+numbers[k];

                    System.out.print(numbers[k]+"  ");
                }
                totalSubarray++;
                System.out.println("= Total sum of Sub Arrays are: "+sum);
            }
            System.out.println("Total sum of a particular pair of number: "+particularSum+ "\n");
        }
        System.out.println("Total Pair of sub arrays: "+totalSubarray);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
    }
}
