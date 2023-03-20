import java.util.*;   
public class searchBST {
    static class Node{
        int data;
         Node left;
         Node right;

         public Node(int data) {
            this.data = data;
         }
    }
  
       public static boolean search(Node root, int key){
        if(root== null){
            return false;

        }
        if(root.data== key){
            return true;

        }
         if(root.data>key){
            return search(root.left, key);
         }
         else{
            return search(root.right, key);
         }

    }
    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
         Node root = null;

         for(int i=0;i<values.length;i++){
           root= insert(root, values[i]);
         }

         inorder(root);
         System.out.println();
         if(search(root, 6)){
            System.out.println("FOUND");

         }
         else{
            System.out.println("NOT FOUND");
         }
    }
    
}
