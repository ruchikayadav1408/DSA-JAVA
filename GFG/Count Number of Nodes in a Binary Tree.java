class Solution {

    public static int countNodes(Node root) {
        // Code here
           if(root== null){
                return 0;
            }

            int leftcount= countNodes(root.left);
            int rightcount= countNodes(root.right);
             return leftcount+rightcount+1; 
    }
}
