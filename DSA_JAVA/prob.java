package com.DSA_JAVA;

import java.util.Scanner;

public class prob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass, empty_seat;
        pass = sc.nextInt();
        pass = pass % 50;
        empty_seat = 50 - pass;
        System.out.println(empty_seat);
    }
}
