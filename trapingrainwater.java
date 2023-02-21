//Given n non-negative integers representing an elevation map where 
//the width of each bar is 1, compute how much water it can trap after raining.
//  Example 1:Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]
//  Output:   6 
//Explanation:The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
   

import java.util;
public class trapingrainwater {
    public static int Trappedwater(int height[]){
        int n=height.length;
        int maxleftheight[]= new int[n];
        // calculate left max  boundary -array
        maxleftheight[0]=height[0];
        for(int i=1;i<n;i++){
            maxleftheight[i]=Math.max(height[i], maxleftheight[i-1]);

        }
        //calculate right max boundary aaray
        int maxrightheight[]= new int[n];
        maxrightheight[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxrightheight[i]=Math.max(height[i], maxrightheight[i+1]);
        }
       int trappedwater=0;
       //calculate trapped water
         for(int i=1;i<n;i++){
            //calculate waterlevel
            int waterlevel=Math.min(maxleftheight[i], maxrightheight[i]);
            trappedwater+=waterlevel - height[i];
         }
         return trappedwater;
    }
     
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
      System.out.print(Trappedwater(height));
    }
}
