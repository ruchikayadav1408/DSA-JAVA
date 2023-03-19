public class minimumdistance{

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2){
        if(root == null || root.data ==n1 || root.data == n2){
            return root;
        }

        Node leftlca= lca(root.left, n1, n2);
        Node rightlca= lca(root.right, n1, n2);

        if(rightlca == null){
            return leftlca;
        }
        if(leftlca== null){
            return rightlca;
        }

        return root;
    }
    public static int lcaDist(Node root, int n){
        if(root== null){
            return -1;
        }

        if(root.data ==n){
            return 0;
        }
        int LeftDist=lcaDist(root.left, n);
        int rightDist= lcaDist(root.right, n);

         if(LeftDist == -1 && rightDist == -1){
            return -1;
         } else if(LeftDist == -1){
            return rightDist+1;
         }
         else{
            return LeftDist+1;
         }

    }

    public static int getDist(Node root, int n1, int n2){
        Node Lca=lca(root, n1, n2);
         int dist1=lcaDist(Lca, n1);
         int dist2= lcaDist(Lca, n2);

           return dist1+dist2;
    }
    public static void main(String args[]) {
    /*
               1
              / \
             2   3
            / \ / \
           4  5 6  7  

         

   */
 
   Node root = new Node(1);
   root.left = new Node(2);
   root.right = new Node(3);
   root.left.left = new Node(4);
   root.left.right = new Node(5);
   root.right.left = new Node(6);
   root.right.right = new Node(7);

   int n1=4 , n2=7;
   System.out.println(getDist(root, n1, n2));
  
}

    
}
