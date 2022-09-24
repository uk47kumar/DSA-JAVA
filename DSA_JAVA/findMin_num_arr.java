package com.DSA_JAVA;

public class findMin_num_arr {
    public static void main(String[] args) {
        int [] arr = {34, 54, -4, -1, 5 };
        System.out.println(min(arr));
    }

    static int min(int [] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }

        }
        return ans;
    }
}
