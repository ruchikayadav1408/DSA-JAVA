//https://leetcode.com/problems/find-target-indices-after-sorting-array/

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ls= new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ls.add(i);
            }
        }
        return ls;
    }
}
