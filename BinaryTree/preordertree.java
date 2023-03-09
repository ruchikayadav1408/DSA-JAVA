import java.util.*;
public class preordertree {   
    static class Node{
        int data;
         Node left;
         Node right;

          Node (int data){
            this.data= data;
            this.left= null;
            this.right= null;

          }

        }
     static class BinaryTree{
        static int  idx=-1;
        public static Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }

             Node newnode= new Node(nodes[idx]);
             newnode.left= buildtree(nodes);
             newnode.right=buildtree(nodes);
              return newnode;
        }
           
         // preorder  NLR :  N- NODE , L - LEFT , R- RIGHT 
           public static void traverse(Node root){   
            if(root== null){
              return ;
            }
             System.out.print(root.data+ " ");
             traverse(root.left);
             traverse(root.right);

           }
         
          // inorder travsere  - LNR
           public static void  inorder (Node root) {
             if(root == null){
              return;
             }
             inorder(root.left);
             System.out.print(root.data+ " ");
             inorder(root.right);
            
           }
         
           //post order  - LRN
           public static void postorder(Node root) {
            if(root== null){
              return;
            }
             postorder(root.left);
             postorder(root.right);
             System.out.print(root.data + " ");
            
           }
          // level order traverse
           public static void levelorder(Node root){
            if(root== null){
              return ;

            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

             while(!q.isEmpty()){
              Node currnode=q.remove();
              if(currnode==null){
                System.out.println();
                if(q.isEmpty()){
                  break;
                }
                else{
                  q.add(null);
                }
              }
              else{
                System.out.print(currnode.data + " ");
                if(currnode.left != null){
                  q.add(currnode.left);

                }
                if(currnode.right != null){
                  q.add(currnode.right);
                }
              }
             }


           }
          }
           public static void main(String args[]) {
            int nodes[]={1,2,4, -1,-1, 5, -1, -1,3, -1,6,-1, -1};
             BinaryTree tree= new BinaryTree() ;
             Node root= tree.buildtree(nodes);
            tree.traverse(root);
            
           }
    
    
}
