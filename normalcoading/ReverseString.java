package com.normalcoading;

public class ReverseString {

    public static void main(String[] args) {

        String inputString = "This Is My String";

        // first method

//        int stringLength = inputString.length();
//
//        while (stringLength>0){
//            System.out.print(inputString.charAt(stringLength-1));
//            stringLength--;

        // second method

//        StringBuffer stringBuffer = new StringBuffer(inputString);
//        stringBuffer.reverse();
//        System.out.print(stringBuffer);

        // third method

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(inputString);
        stringBuilder.reverse();
        System.out.print(stringBuilder);

    }
}
