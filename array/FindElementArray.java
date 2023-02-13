package com.array;

import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();

        int initialAns = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                initialAns = i;
                break;
            }
        }
        System.out.println(initialAns);
    }
}
