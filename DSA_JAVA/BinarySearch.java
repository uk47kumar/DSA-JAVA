package com.DSA_JAVA;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {-5, -3, -1, 0, 2, 4, 5, 7, 9};
        int target = 2;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int [] arr, int target){
        //find the middle element in the array
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                // answer found
                return mid;
            }
        }
        return -1;
    }
}
