package com.normalcoading;

public class ReverseSentence {
    public static void main(String[] args) {
        String inputString = "My name is ujjwal";
        String rev = "";

        String s[] = inputString.split(" ");

        for(int i=0; i<s.length; i++){
            rev = s[i]+" "+rev;
        }
        System.out.print("Reversed Sentence: "+rev);
    }
}
