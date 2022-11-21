package com.array.linear;

public class LargestNumber {

    public static int findLargest(int numbers[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<numbers.length; i++){
            if(max<numbers[i]){
                max = numbers[i];
            }
            if(min>numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("The smallest value is: " + min);
        return max;
    }

    public static void main(String[] args) {
        int numbers[] = {3,5,6,2,9};
        System.out.println("The largest value is: " + findLargest(numbers));
    }
}
