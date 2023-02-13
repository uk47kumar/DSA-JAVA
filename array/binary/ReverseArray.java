package com.array.binary;

public class ReverseArray {

    public static void binaryReverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while (first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2,3,4,6,7,8,9};

        binaryReverse(numbers);

        for (int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }

        // Changing of an array...

        int first[] = {3,5,3,45,5};

        int second[] = first;

        // Changing the 0th index of an array...
        second[0] = 4;

        // printing first array
        System.out.println();
        for(int element : first){
            System.out.print(element+" ");
        }

        // printing second array
        System.out.println();
        for(int element : second){
            System.out.print(element+" ");
        }
    }
}
