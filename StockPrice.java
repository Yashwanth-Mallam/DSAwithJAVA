// Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. 
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and 
// sell on day 5 (price = 6), profit = 6-1 = 5.
// Note: That buying on day 2 and selling on day 1 
// is not allowed because you must buy before 
// you sell.

// Example 2:
// Input: prices = [7,6,4,3,1]
// Output: 0
// Explanation: In this case, no transactions are 
// done and the max profit = 0.

import java.util.Scanner;

public class StockPrice {
    // method
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0]; //this will be the initial price.
        
        for(int i=0; i<prices.length;i++){
            maxProfit = Math.max(maxProfit, prices[i]-minPrice); // this will pick the max value between the current maxProfit and the current price - minPrice.
            if(minPrice>prices[i]){
                minPrice = prices[i];
            }
        }
        return maxProfit;
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result = maxProfit(arr);
        System.out.println("the max profit you can achieve from this transaction is "+result);
        sc.close();
    }
}
