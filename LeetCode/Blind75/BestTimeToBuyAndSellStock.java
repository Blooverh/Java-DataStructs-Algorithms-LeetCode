package Blind75;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    //sliding window problem
    public static int maxProfit(int[] prices) {
        
        if(prices.length ==0){
            return 0;
        }

        int lowestValDay= Integer.MAX_VALUE;
        int profit=0;
        int profitIfSoldToday=0;
        
        for(int i=0; i< prices.length; i++){ 
            if(prices[i] < lowestValDay){ //loop thru the prices[i] and if lower than lowestValDay, price[i] becomes lowest 
                lowestValDay= prices[i]; //update our lowestValDay to the lowest value in array which is 1
            }

            profitIfSoldToday = prices[i] - lowestValDay; //check for each value of i - lowestValDay which is 1 

            if(profit < profitIfSoldToday){ //if PIST is bigger than profit, profit = PIST
                profit= profitIfSoldToday;
            }
        }
        return profit;
    }
}
