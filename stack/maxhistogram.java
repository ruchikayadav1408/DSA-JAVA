import java.util.*;
public class maxhistogram {

    public static void maxarea(int arr[]) {
        Stack<Integer> s= new Stack<>();
        int MaxArea= 0;
        int nsl[]= new int[arr.length];
        int nsr[]= new int[arr.length];

        //next smalller right
        for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        // next smaller right
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                    s.pop();
    
                }
                if(s.isEmpty()){
                    nsl[i]=arr.length;
                }
                else{
                    nsl[i]=s.peek();
                }
                s.push(i);
            }
            // current area : width = j-i-1 or nsr[i]- nsl[i]-1
            for(int i=0;i<arr.length;i++){
                int height=arr[i];
                int width=nsr[i]- nsl[i]-1;
                int currArea= height * width;
                MaxArea=Math.max(MaxArea, currArea);

            }
            System.out.println("Max area in histogram: " + MaxArea);


        
    }
     public static void main(String args[]) {
        int arr[]={2,1,5,6,2,3};
        maxarea(arr);
        
    }
    
}
