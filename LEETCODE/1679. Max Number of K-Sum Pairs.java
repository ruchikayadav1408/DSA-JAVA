//https://leetcode.com/problems/max-number-of-k-sum-pairs/

class Solution {
    public int maxOperations(int[] nums, int k) {
         Arrays.sort(nums);
        int i=0;
        int j = nums.length-1;
        int cnt=0;
        while(i<j){
            if(nums[i]+nums[j]==k){
                cnt++;
                 i++;
                  j--;
            }
            else if(nums[i]+nums[j] < k){
                i++;
            }
            else j--;
        }
        return cnt;
    }
}
