class Solution {
    public int compress(char[] chars) {
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<chars.length;i++){
            int count =1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            sb.append(chars[i]);
            if(count>1){
                sb.append(count);
            }
        }
        for(int j=0; j<sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }
}
