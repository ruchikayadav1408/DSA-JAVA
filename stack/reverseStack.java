import java.util.*;
public class reverseStack{

public static void reversestack(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reversestack(s);
        pushAtbottom(s, top);
      }
      //print

      public static void print(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
      }
    public static void main(String args[]){

        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
         reversestack(s);
         print(s);
      
    }
    
}
