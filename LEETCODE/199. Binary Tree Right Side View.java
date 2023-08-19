class Solution {
     List<Integer> ans;
     static class QueueInfo {
        TreeNode node;
        int hd;

        public QueueInfo(TreeNode node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
          ans= new ArrayList<>();
          topView(root);
        return ans;
    }
     public void topView(TreeNode root) {
        if (root == null) 
        return;
    
         HashMap<Integer, TreeNode> map = new HashMap<>();
        Queue<QueueInfo> q = new LinkedList<>();
        q.add(new QueueInfo(root, 0));
        q.add(null);
        int  max = 0;

        while(!q.isEmpty()) {
            QueueInfo curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {

                //check if HD is encountered for 1st time
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.right != null) {
                    q.add(new QueueInfo(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
                 if(curr.node.left != null) {
                    q.add(new QueueInfo(curr.node.left, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }

        for(int i=0; i<=max; i++) {
           ans.add(map.get(i).val);
        }

    }
}
