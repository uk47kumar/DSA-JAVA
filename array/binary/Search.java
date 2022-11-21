package com.array.binary;

public class Search {

    public static int binarySearch(int numbers[], int element){

        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==element){
                return mid;
            }
            if(numbers[mid]<=element){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,3,4,5,7,9};
        int element = 9;
        int ans = binarySearch(numbers,element);
        System.out.println(ans);
    }
}