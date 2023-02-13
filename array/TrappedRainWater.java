package com.array;

public class TrappedRainWater {

    public static int trapped(int height[]){

        int n = height.length;
        // creating two auxiliary array

        // first is the maximum of left
        int leftMaximum[] = new int[n];
        leftMaximum[0]=height[0];
        for (int i = 1; i < n; i++) {
            leftMaximum[i] = Math.max(height[i], leftMaximum[i-1]);
        }
        // and second is the maximum of right
        int rightMaximum[] = new int[n];
        rightMaximum[n-1]=height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightMaximum[i] = Math.max(height[i], rightMaximum[i+1]);
        }
        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMaximum[i], rightMaximum[i]);
            trapWater += waterLevel - height[i];
        }
        return trapWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trapped(height));
    }
}
