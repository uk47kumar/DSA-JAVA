package com.array.linear;

public class searching {

    public static int searching(int marks[], int element){
        for (int i=0; i<marks.length; i++){
            if (marks[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int marks[] = {2,4,5,3,6};
        int element = 10;
        int ans = searching(marks,element);
        if(ans==-1){
            System.out.println("Item not found");
        }
        else {
            System.out.println("Item found: "+ans);
        }
    }
}
