package com.array;

public class PairArray {

    public static void printpair(int numbers[]){
        int totalPair = 0;             //for checking total pair
        for (int i=0; i<numbers.length; i++){
            int currentNumber = numbers[i];
            for (int j=i+1; j<numbers.length; j++){
                System.out.print("(" + currentNumber + ","+ numbers[j] + ")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("Total pair: "+totalPair);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printpair(numbers);
    }
}
