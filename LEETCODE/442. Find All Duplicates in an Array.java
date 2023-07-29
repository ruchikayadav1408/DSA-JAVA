class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();   // created a new list to store the answer
        Arrays.sort(nums);      // sorted the array so that the duplicates are next to each other
        
        for(int i = 0; i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) {        // checking i and i +1 elements if they are equal
                list.add(nums[i]);           //  adding the duplicates in the list.
            }
        }
        return list;     
    }
}
