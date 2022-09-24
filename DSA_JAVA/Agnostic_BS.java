package com.DSA_JAVA;

public class Agnostic_BS {
    public static void main(String[] args) {
//        int [] arr = {-5, -3, -1, 0, 2, 4, 5, 7, 9};
        int [] arr = {12, 11, 8, 7, 4, 3, 1, -1, -5, -7};
        int target = -1;
        int ans = agnosticSearch(arr, target);
        System.out.println(ans);
    }

    static int agnosticSearch(int [] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // we have to check the array is ascending or descending
        boolean IsAscending = arr[start] < arr[end];

        // find the middle element
        while (start<=end){
            int mid = start + (end-start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (IsAscending){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
