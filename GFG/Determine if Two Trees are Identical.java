class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class Solution
{
    //Function to check if two trees are identical.
      public static boolean issubtree(Node node, Node subRoot) {
        if(node == null && subRoot==null){
            return true;
        }
        else if(node == null || subRoot==null || node.data!=subRoot.data){
            return false;
        }
        if(!issubtree(node.left, subRoot.left)){
            return false;
        }
        if(!issubtree(node.right, subRoot.right)){
            return false;
        }
        return true;
    }
    
	boolean isIdentical(Node root, Node subRoot)
	{
	    // Code Here
	            if(root == null){
            return false;

        }
        if(root.data == subRoot.data){
            if(issubtree(root , subRoot)){
                return true;
            }
        }

         return isIdentical(root.left, subRoot) || isIdentical(root.right, subRoot);

	}
	
}
