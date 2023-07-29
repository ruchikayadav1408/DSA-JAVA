class Solution {
    public int search(int[] nums, int target) {
        return find(nums , target);
       
    }
    public int find(int[] nums, int target){
        HashMap<Integer , Integer> hm= new HashMap<>();
          for(int i=0;i<nums.length;i++){
              hm.put(nums[i] , i);
          }
          int ans=0;
            if(hm.containsKey(target)){
              ans=hm.get(target);
              return ans;         
                 }
    
        return -1;
    }
}
