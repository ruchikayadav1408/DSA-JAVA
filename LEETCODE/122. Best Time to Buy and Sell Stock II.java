class Solution {
    public int maxProfit(int[] prices) {
         int profit=0;
        int buyprice=prices[0];
        //CALCULATE MAXIMUM PROFIT
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buyprice){
                  buyprice=prices[i];
            }
            else{
                  profit+=prices[i]- buyprice;
              buyprice=prices[i];
            }
        }
    return profit;
    }
}
