//return all elements of the matrix in spiral order
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 

import java.util.*;
public class matrixspiral {
    
        public static boolean spiralOrder(int matrix[][]) {
            int startrow=0;
            int startcol=0;
            int endrow=matrix.length-1;
            int endcol=matrix[0].length-1;
           
         while(startrow<=endrow && startcol<=endcol){
             for(int j=startcol;j<=endcol;j++){
                 //top
                 System.out.print(matrix[startrow][j]+" ");
             }
                //right
                 for(int i=startrow+1;i<=endrow;i++){
                 
                 System.out.print(matrix[i][endcol]+ " ");
             }
                 for(int j=endcol-1;j>=startcol;j--){
                     if(startrow==endrow){
                         break;
                     }
                 //bottom
                 System.out.print(matrix[endrow][j]+" ");
             }
                 for(int i=endrow-1;i>=startrow+1;i--){
               //left
                     if(startcol==endcol){
                         break;
                     }
                 System.out.print(matrix[i][startcol]+" ");
             }
                startrow++;
                startcol++;
                endrow--;
                endcol--;
            
        }
      return true;
        }
        public static void main(String args[]){
          /*  Scanner sc = new Scanner(System.in);
            
            int matrix[][]=new int[50][50];
            for(int i=0;i<matrix.length;i++){
                   for(int j=0;i<matrix.length;j++){
            matrix[i][j]=sc.nextInt();
            }
            }*/
            int matrix[][]={{1,2,3,4},
                            {5,6,7,8},
                            {9,10,11,12}, 
                            {13,14,15,16}};
            System.out.println(spiralOrder(matrix));
        }

    
}
