package com.array;

import java.util.HashSet;
import java.util.Set;

public class ArraySection {

    public static void pairOfArray(int[] arr){
        for (int i =0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
        }
    }

    public static boolean duplicate(int[] arr){

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        if(arr.length== set.size()){
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,5,6,7};
        pairOfArray(arr);
        System.out.println();
        System.out.println(duplicate(arr));
    }
}
