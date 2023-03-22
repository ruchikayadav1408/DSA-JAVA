    public class validate {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

   public static boolean isValidate(Node root, Node min , Node max){
            if(root== null){
                return true;
            }
            if(min!=null  && root.data <= min.data){
                return false;
            }
            else if(max!= null  && root.data >= max.data ){
                return false;
            }
            return isValidate(root.left, min, root) &&
             isValidate(root.right, root, max);
            
        }
      public static void main(String args[]) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root= null;
    if(isValidate(root, null, null)){
        System.out.println("valid");

       }
       else {
        System.out.println(" not valid");
       }
    }
}
