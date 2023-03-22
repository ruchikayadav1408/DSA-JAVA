public class printrange {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
 //print in range
       public static void printinrange(Node root , int k1, int k2) {
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data<= k2){
            printinrange(root.left, k1, k2);
            System.out.print(root.data+ " ");
            printinrange(root.right, k1, k2);

        }
        else if(root.data<k1){
            printinrange(root.left, k1, k2);
        }
        else{
            printinrange(root.right, k1, k2);
        }
       }
   public static void main(String args[]) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root= null;

         for(int i=0;i<values.length;i++){
            root=insert(root, values[i]);

         }
        inorder(root);
        System.out.println();

        printinrange(root, 5, 12);
   }
