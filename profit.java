//You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
 //   Return the maximum profit you can achieve from this transaction.
  //  If you cannot achieve any profit, return 0.
 //   Example 1:Input:prices = [7, 1, 5, 3, 6,  4]  
  //  Output:   5 
   //     Explanation:Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

public class profit{
    public static int buyandsell(int prices[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        //CALCULATE MAXIMUM PROFIT
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){
              int profit=prices[i]- buyprice;
              maxprofit=Integer.max(maxprofit, profit);
            }
            else{
                buyprice=prices[i];
            }
        }
    return maxprofit;

    }
    public static void main(String args[]) {
     int prices[]={7,1,5,3,6,4};
     System.out.println("MAXIMUM PROFIT: ");
        System.out.println(buyandsell(prices));
        
    }
}
