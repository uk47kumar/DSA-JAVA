package com.normalcoading;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = n;
        int nod = 0;
        while(temp>0){
            temp = temp/10;
            nod++;
        }

        //to handle big rotation and negative number
        k = k % nod;
        if (k < 0){
            k = k + nod;
        }

        int divisor = 1;
        int multiplayer = 1;
        for(int i=1; i<=nod;i++){
            if(i<=k){
                divisor = divisor * 10;
            }
            else {
                multiplayer = multiplayer * 10;
            }
        }

        int quotient = n / divisor;
        int remainder = n % divisor;
        int rotatedNumber = remainder * multiplayer + quotient;

        System.out.println(rotatedNumber);
    }
}
