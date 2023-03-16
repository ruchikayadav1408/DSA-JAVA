public class Diametertree{
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
  // APPROACH -1 O(N^2)
         public static int diameter(Node root){
            if(root == null){
                return 0;
            }
             int leftDiam= diameter(root.left);
             int leftheight = height(root.left);
             int rightDiam = diameter(root.right);
             int rightheight = height(root.right);
             
             int selfdiam= leftheight+ rightheight+1;
              
             return Math.max(selfdiam , Math.max(rightDiam, leftDiam));

         }
    
    
         //APPROACH - 2 O(N)

         static class Info{
            int ht;
            int diam;

            public Info(int diam , int ht){
                this.diam= diam;
                this.ht= ht;
            }    
             }

             public static Info diameter2(Node root){
                if(root== null){
                    return new Info(0, 0);
                }
                Info leftInfo =diameter2(root.left);
                Info rightInfo= diameter2(root.right);

                int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
                int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;

                 return new Info(diam , ht);
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
     
       System.out.print("Diameter of tree : " + diameter(root));   //approach 1 - O(N^2)
         System.out.println("diamrter of tree : " + diameter2(root).diam);    //Approach 2 - O(N)
    }
    
}
