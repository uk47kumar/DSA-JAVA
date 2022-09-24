package com.DSA_JAVA;

public class EvenDigit {
    public static void main(String[] args) {
        int [] nums = {23, 423, 4342, 4343, 34, 2};
//        System.out.println(FindNumber(nums));
        System.out.println(digits(0));
    }

    static int FindNumber(int [] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numbersOfDigits = digits(num);
        if (numbersOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        if (num < 0){
            num = num * -1;
        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

}
