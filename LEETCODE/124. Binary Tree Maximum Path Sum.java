class Solution {
    TreeNode root;
    public int maxPathSum(TreeNode node) {
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        findMaxUtil(node, res);
        return res.val;
    }
    class Res {
        public int val;
    }
            int findMaxUtil(TreeNode node, Res res){
                if (node == null)
                return 0;
                int l = findMaxUtil(node.left, res);
                int r = findMaxUtil(node.right, res);
                int max_single = Math.max(Math.max(l, r) + node.val,node.val);
                int max_top = Math.max(max_single, l + r + node.val);
                res.val = Math.max(res.val, max_top);
                return max_single;
                }
                int findMaxSum() {
             return maxPathSum(root);}
}
