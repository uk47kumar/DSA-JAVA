package com.normalcoading;

public class OccuranceString {
    public static void main(String[] args) {

        String inputString = "hello how are you";
        int count=0;
        char search = 'o';

        for(int i=0; i<inputString.length();i++){

            if(inputString.charAt(i)==search){
                count++;
            }
        }
        System.out.println(count);
    }
}
