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

class Solution {
  public static int maxDepth(Node root) {
    // code here
    if(root==null){
            return 0;
        }
        int lh= maxDepth(root.left);
        int rh= maxDepth(root.right);

        int height= Math.max(lh , rh) +1;
        return height;

  }
}
     
