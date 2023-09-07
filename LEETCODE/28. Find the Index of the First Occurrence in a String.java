class Solution {
    public int strStr(String haystack, String needle) {
         int length = needle.length();
        for(int i=0;i<haystack.length()-length+1;i++){
            String s = haystack.substring(i,i+length);
            if(s.equals(needle)){
                return i;
            }
        }
        return  -1;
    }
}
