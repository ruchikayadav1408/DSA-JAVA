/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        // Your code here
        
        ArrayList <Integer> ls= new ArrayList<>();
            Queue<Node> q=new LinkedList<>();
            q.add(root);

             while(!q.isEmpty()){
              Node currnode=q.remove();
                  ls.add(currnode.data);
                if(currnode.left != null){
                  q.add(currnode.left);

                }
                if(currnode.right != null){
                  q.add(currnode.right);
                }
              }
            
             return ls;
    }
}



