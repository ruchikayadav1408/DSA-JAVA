class Solution{
    static List<Integer> minPartition(int amount)
    {
        // code here
        Integer coins[]={1,2,5,10, 20, 50, 100,200, 500, 2000};
         Arrays.sort(coins, Comparator.reverseOrder());
        int countofcoins =0;
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<= amount){
                while(coins[i]<= amount){
                    countofcoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];

                }
            }
        }
       return ans;
        
    }
}
