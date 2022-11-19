package com.pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i>=1; i--){
            for (int j=1; j<=n; j++){
                if (i==j){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println(" ");
        }
    }
}
