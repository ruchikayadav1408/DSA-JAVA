//https://leetcode.com/problems/subsets/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
        findsubsets(nums , new ArrayList<>() ,ans, 0);
        return ans;
    }

    public static void findsubsets(int nums[] ,List<Integer> list,   List<List<Integer>> ans , int i){
         if(ans.contains(list)) 
         { 
             return;
         }
         if(i==nums.length){
           ans.add(new ArrayList<>(list));
           return ;
             
         }

        //recursion
        //yes choice
        list.add(nums[i]);
        findsubsets(nums,list ,  ans , i+1);
        //no choice
        list.remove(list.size()-1);
         findsubsets(nums, list, ans , i+1);
    }
}
