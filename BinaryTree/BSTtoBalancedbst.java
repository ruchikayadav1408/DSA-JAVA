import java.util.*;

public class BSTtoBalancedbst {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //preorder
    public static void traverse(Node root){
        if(root== null){
          return ;
        }
         System.out.print(root.data+ " ");
         traverse(root.left);
         traverse(root.right);

       }
       public static void getInorder(Node root, ArrayList<Integer> arr) {
        if(root == null) {
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);
        getInorder(root.right, arr);
    }

    public static Node balanceBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        getInorder(root, arr);
        return convertToBST(arr, 0, arr.size()-1);
    }

    public static Node convertToBST(ArrayList<Integer> arr, int si, int end){
        if(si> end){
            return null;
        }
        int mid=(si+end)/2;
        Node root= new Node(arr.get(mid));
        root.left=convertToBST(arr, si, mid-1);
        root.right= convertToBST(arr, mid+1, end);
        return root;

    }
    public static void main(String args[]) {
        /*
                     8
                   /   \
                  6     10
                 /       \
                5         11 
               /           \
              3             12
            given BST
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /*
                     8
                   /   \
                  5     11
                 / \    / \
                3   6  10 12   
            expected BST
         */

         root= balanceBST(root);
         traverse(root);
    }
}
