   public class ROOTLEAF {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
         //root to leaf
       public static void printpath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
       }
     
     
       public static void roottoleaf(Node root, ArrayList<Integer> path) {
        if(root== null){
            return;
        }
        path.add(root.data);
        if(root.left== null && root.right == null){
            printpath(path);
        }
          roottoleaf(root.left, path);
          roottoleaf(root.right, path);
          path.remove(path.size()-1);
       }
     
     public static void main(String args[]) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root= null;
        roottoleaf(root, new ArrayList<>());
     }
   }
