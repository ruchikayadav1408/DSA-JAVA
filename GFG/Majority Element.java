//https://practice.geeksforgeeks.org/problems/majority-element-1587115620/0

//User function Template for Java

class Solution
{
    static int majorityElement(int arr[], int size)
    {
       HashMap<Integer , Integer> map =  new HashMap<>();
        for(int i=0 ; i<arr.length; i++){
           if(map.containsKey(arr[i])){
            map.put(arr[i] ,map.get(arr[i]) +1);
           }
           else{
            map.put(arr[i], 1);
           }
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > arr.length/2){
                  return  key ;
            }
        }
        return -1;
        
    } 
   
}
