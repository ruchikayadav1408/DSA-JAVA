import java.util.*;;

public class duplicateparenthesis {

    public static boolean isduplicate(String str){
        Stack<Character> s= new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            // closing 
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;

                }
                if(count<1){
                    return true; // duplicate exist
                }
                else{
                    s.pop();//opening pair
                }
            }
            else{
                //opening
            s.push(ch);
            }
        
        }
        return false;
    }
    public static void main(String args[]){
        String str="(((a+b)+ c))";
        System.out.println(isduplicate(str) + " \nduplicate pair exist");
    }
}
