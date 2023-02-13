package com.pattern;

public class fun {

    public static void fun(int x){
        if(x>0){
            fun(--x);
            System.out.println(x);
            fun(--x);
        }
    }

    public static void main(String[] args) {
        int a =4;
        fun(a);
    }
}
