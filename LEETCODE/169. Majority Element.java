https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] arr) {

        int majoritycount=arr.length/2;

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
          if(count>majoritycount){
            return arr[i];
        
            
        }
        }
        
        return -1;
    
}
}
