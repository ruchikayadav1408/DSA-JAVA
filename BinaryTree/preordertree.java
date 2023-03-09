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
           

           public static void traverse(Node root){
            if(root== null){
              return ;
            }
             System.out.print(root.data+ " ");
             traverse(root.left);
             traverse(root.right);

           }
          }
           public static void main(String args[]) {
            int nodes[]={1,2,4, -1,-1, 5, -1, -1,3, -1,6,-1, -1};
             BinaryTree tree= new BinaryTree() ;
             Node root= tree.buildtree(nodes);
            tree.traverse(root);
            
           }
    
    
}
