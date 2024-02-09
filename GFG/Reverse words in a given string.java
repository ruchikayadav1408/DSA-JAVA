/* Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

Example 1:

Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i  */

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here
        String ans="";
        String arr[]=S.split("\\.");
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i];
            
            if(i!=0){
                ans+=".";
            }
        }
        
        return ans;
    }
}
