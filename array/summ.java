package com.array;

import java.util.Scanner;

public class summ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int evenSum=0;
        int oddSum=0;

        String str = String.valueOf(num);

        for(int i=0; i<str.length(); i++){

            int temp = Integer.parseInt(str.substring(i,i+1));
            if(temp%2==0){
                evenSum+=temp;
            }else {
                oddSum+=temp;
            }
        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
