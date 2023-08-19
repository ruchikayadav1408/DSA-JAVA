/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class Solution {
    //Function to find the height of a binary tree.
    int height(Node root) 
    {
        // code here 
        if(root==null){
            return 0;
        }
        int lh=  height(root.left);
        int rh=  height(root.right);

        int height= Math.max(lh , rh) +1;
        return height;
    }
}
