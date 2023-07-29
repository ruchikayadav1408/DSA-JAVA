class Solution {
    public boolean search(int[] nums, int target) {
         return find(nums , target);
       
    }
    public boolean find(int[] nums, int target){
        HashMap<Integer , Integer> hm= new HashMap<>();
          for(int i=0;i<nums.length;i++){
              hm.put(nums[i] , i);
          }
          int ans=0;
            if(hm.containsKey(target)){
              ans=hm.get(target);
              return true;         
                 }
    
        return false;
    }
}
