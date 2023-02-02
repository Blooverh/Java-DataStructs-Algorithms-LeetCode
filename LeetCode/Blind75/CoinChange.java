package Blind75;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] nums= {1,2,5};
        int amount=11;
        System.out.println(coinChange(nums, amount));
    }
    //O(n*m) time complexity
    //O(n) space complexity because based on the amount value, it increases if amount increases hence being linear
    public static int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1); //fills all indices with amount +1 
        System.out.println(Arrays.toString(dp));
        dp[0]=0;
        for(int i=1;i<=amount;i++)
            for(int c:coins)
                if(i>=c) dp[i]=Math.min(dp[i],dp[i-c]+1);
        System.out.println(Arrays.toString(dp));
        return dp[amount]>amount?-1:dp[amount];
    }
}
