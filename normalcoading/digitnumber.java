package com.normalcoading;

import java.util.Scanner;

public class digitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int digit = 0;
        int temp = n;
        //for count the number
        while (temp != 0){
            temp = temp/10;
            digit++;
        }

        //geeting the divisor where n id dividend and div is divisor
        int div = (int)Math.pow(10, digit - 1);
        while (div != 0){
            int q = n/div;
            System.out.println(q);

            //decrease the value of the dividend
            n = n % div;

            //decrease the value of divisor
            div = div/10;
        }
    }
}
