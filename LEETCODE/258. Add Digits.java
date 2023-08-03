class Solution {
    public int addDigits(int num) {
        while(num>9)
        {
            num=check(num);
        }
        return num;
    }
     public int check(int num){
        int ans=0;
        while(num>0){
        int ld=num%10;
         ans= ans+ld;
        num=num/10;
    }

   return ans;
    }
}
