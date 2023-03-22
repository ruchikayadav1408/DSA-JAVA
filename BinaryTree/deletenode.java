public class deletenode {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //delete
    public static Node delete(Node root, int val){
        if(root.data<val){
           root.right=delete(root.right, val);

        }
        else if(root.data> val){
            root.left= delete(root.left, val);
        }
        else{
            //voila
            //case-1 leaf node
            if(root.left== null && root.right== null){
                return null;
            }
            //case-2 single node 
           if(root.left== null){
            return root.right;
           }
           else if(root.right== null){
            return root.left;
           }
           //case-3
           Node IS=findinordersuccessor(root.right);
           root.data=IS.data;
           root.right=delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findinordersuccessor(Node root){
        while(root.left!= null){
            root= root.left;
        }
        return root;
    }
}
