package com.normalcoading;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inverse = 0;
        int originalPlace = 1;
        while (n!=0){
            int originalDigit = n%10;

            int invertedDigit = originalPlace;
            int invertedPlace = originalDigit;

            // make change to inverse using invertedDigit and invertedPlace
            inverse = inverse + invertedDigit * (int)Math.pow(10, invertedPlace-1);

            n = n/10;
            originalPlace++;
        }
        System.out.println(inverse);
    }
}
