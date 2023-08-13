//https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

class Solution {
    public int findMinArrowShots(int[][] points) {
      Arrays.sort(points, Comparator.comparingDouble(o -> o[1]));
         int chainlength=1;
         int chainend=points[0][1];
         for(int i=0;i<points.length;i++){
            if(points[i][0]> chainend){
                chainlength++;
                chainend= points[i][1];
            }
         }
        return chainlength;
    }
}
