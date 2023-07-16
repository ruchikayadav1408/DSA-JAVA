//https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/0

class Solution
{
    public String transform(String str)
    {
        // code here
        StringBuilder sb= new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for(int i=1;i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
