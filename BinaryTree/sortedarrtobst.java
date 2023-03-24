public class sortedarrtobst {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createBST(int arr[], int si, int end){
        if(si> end){
            return null;
        }
        int mid=(si+end)/2;
        Node root= new Node(arr[mid]);
        root.left= createBST(arr, si, mid-1);
        root.right= createBST(arr, mid+1, end);
        return root;

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
    public static void main(String args[]) {
        int arr[]={3,5,6,8,10,11,12};
        /*
           8
          /  \ 
         5    11
        / \   / \
       3   6 10  12


         */
      Node root=   createBST(arr, 0, arr.length-1);
      traverse(root);
    }
}
