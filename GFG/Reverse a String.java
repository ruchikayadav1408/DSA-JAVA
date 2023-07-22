//https://practice.geeksforgeeks.org/problems/reverse-a-string/0

//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        
         String  nstr="";
        char ch;
     for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
       return  nstr;
    }
}
