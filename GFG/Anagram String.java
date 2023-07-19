class Solution {
    static int areAnagram(String str1, String str2) {
        // code here
          if(str1.length()== str2.length()){
        //convert string to char array
        char[] str1charArray=str1.toCharArray();
         char[] str2charArray=str2.toCharArray();

         //sort array
         Arrays.sort(str1charArray);
         Arrays.sort(str2charArray);

         boolean result=Arrays.equals(str1charArray, str2charArray);
         if(result){
            return 1;
         }
         
        
    }
    return 0;
    }
}
