//leetcode.com/problems/next-greater-element-ii/description/
//Input: nums = [1,2,1]
//Output: [2,-1,2]
//Explanation: The first 1's next greater number is 2; 
//The number 2 can't find next greater number. 
//The second 1's next greater number needs to search circularly, which is also 2.

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s= new Stack<>();
        int nextgreat[]=new int[nums.length];
           for(int i=nums.length-1; i>=0;i--){
               s.push(i);
           }
        for(int i=nums.length-1; i>=0;i--){
            nextgreat[i]=-1;
            while(!s.isEmpty() &&  nums[s.peek()]<=nums[i]){
                s.pop();
            }
            if(!s.isEmpty()){
            
                nextgreat[i]=nums[s.peek()];
            }
            s.push(i);
        }
        return nextgreat;
    }
}
