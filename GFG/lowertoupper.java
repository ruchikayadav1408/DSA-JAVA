//https://practice.geeksforgeeks.org/problems/lower-case-to-upper-case3410/0

class Solution 
{ 
    String to_upper(String str) 
    { 
        // code here
          StringBuilder sb= new StringBuilder("");
           for(int i=0;i<str.length(); i++){
         sb.append(Character.toUpperCase(str.charAt(i)));
           }
        
        return sb.toString();
    }
} 
