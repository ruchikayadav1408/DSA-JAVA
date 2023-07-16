class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String str1,String str2)
    {
        
        // Your code here
        if(str1.length()== str2.length()){
        //convert string to char array
        char[] str1charArray=str1.toCharArray();
         char[] str2charArray=str2.toCharArray();

         //sort array
         Arrays.sort(str1charArray);
         Arrays.sort(str2charArray);

         boolean result=Arrays.equals(str1charArray, str2charArray);
         if(result){
            return true;
         }
         
        
    }
    return false;
}
}
