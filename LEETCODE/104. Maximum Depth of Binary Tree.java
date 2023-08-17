class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lh= maxDepth(root.left);
        int rh= maxDepth(root.right);

        int height= Math.max(lh , rh) +1;
        return height;
    }
}
