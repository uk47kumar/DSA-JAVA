package com.sorting;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,1,6,3};
        selectionSort(arr);
        for(int e : arr){
            System.out.print(e+" ");
        }
    }
}
