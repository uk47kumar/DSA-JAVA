package com.DSA_JAVA;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] wealth = {
                {2, 1, 4},
                {1, 3, 6}
        };
        int answer = MaximumWealth(wealth);
        System.out.println(answer);
    }

    static int MaximumWealth(int [][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }
            if (sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
