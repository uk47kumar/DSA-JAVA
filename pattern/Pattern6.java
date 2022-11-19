package com.pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = 1;
        int star = n/2+1;
        for (int i=1; i<=n; i++){
//            System.out.println(star+", "+space+" , "+star);
            for (int j=1; j<=star; j++){
                System.out.print("*\t");
            }
            for (int j=1; j<=space; j++){
                System.out.print("\t");
            }
            for (int j=1; j<=star; j++){
                System.out.print("*\t");
            }
            if (i<=n/2){
                space+=2;
                star--;
            }
            else {
                space-=2;
                star++;
            }
            System.out.println(" ");
        }
    }
}
