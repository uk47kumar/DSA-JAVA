package com.array;

public class BuyAndSellStock {

    public static int profit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        if(maxProfit > 0){
            return maxProfit;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(profit(prices));
    }
}
