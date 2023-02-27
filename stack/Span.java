import java.util.*;

public class Span {

    public static void stockspan(int stocks[], int span[]){
        Stack<Integer> s= new Stack<>();
        span[0]= 1;
        s.push(0);
        for(int i=1; i<stocks.length;i++){
            int currprice= stocks[i];
            while(!s.isEmpty() && currprice> stocks[s.peek()]){
                s.pop();

            }
            if(s.isEmpty()){
                span[i]= i+1;

            }
            else{
                int prevhigh= s.peek();
                span[i]= i-prevhigh;
            }
            s.push(i);
        }

    }
    public static void main(String args[]) {
         int stocks[]={100, 80, 60,70, 65, 85, 100};
         int span[]=new int[stocks.length];
         stockspan(stocks, span);

       for(int i=0;i<span.length;i++){
        System.out.println(span[i]+ " ");
       }
    }
    
}
