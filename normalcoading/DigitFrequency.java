package com.normalcoading;

import java.util.Scanner;

public class DigitFrequency {

    public static int digitFrequency(int n , int d){
        int count = 0;

        while (n>0){
            int digit = n%10;
            n = n/10;
            if(digit == d){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = digitFrequency(n,d);
        System.out.println(f);
    }
}
