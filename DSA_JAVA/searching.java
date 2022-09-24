package com.DSA_JAVA;

public class searching {
    public static void main(String[] args) {
        int [] nums = {3, 5, 65, 33, 77};
        int target = 65;
        int ans = search(nums,target);
        System.out.println(ans);
    }

    static int search(int [] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {

            int element = arr[index];
            if(element==target){
                return index;
            }
        }
//        for(int element : arr){
//            if (element==target){
//                return element;
//            }
//        }

        return -1;
    }
}
