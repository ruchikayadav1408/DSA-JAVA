public class kthancestor {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int ansestor(Node root, int k, int n){
        if(root== null){
            return -1;
        }
        if(root.data== n){
            return 0;
        }
        int LeftDist=ansestor(root.left, k, n);
        int rightdist= ansestor(root.right, k, n);

         if(LeftDist== -1 &&rightdist== -1){
            return -1;
         }
         int max= Math.max(LeftDist, rightdist);
         if(max+1== k){
            System.out.println(root.data + " ");
         }
         return max+1;

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
    
    
      ansestor(root, 2, 5);
      
    }
    
}
