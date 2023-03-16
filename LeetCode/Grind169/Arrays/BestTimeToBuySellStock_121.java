package Grind169.Arrays;

public class BestTimeToBuySellStock_121 {
    public static void main(String[] args) {
        
    }

    public static int maxProfit(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int profit=0;    
        int pist=0;

        for(int i=0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice= prices[i];
            }

            pist= minPrice- prices[i];

            if(profit < pist){
                profit= pist;
            }

        }

        return profit;
    }
}
