package com.DSA_JAVA;

import java.util.Arrays;

public class string_name_to_array {
    public static void main(String[] args) {
        String name = "ujjwal";
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean search(String str, char target){
        if (str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
