class Solution {
    String removeVowels(String S) {
        // code here
        String s1 = "";
        s1 = S.replaceAll("[aeiouAEIOU]", ""); 
        return s1;
           
    }
}
