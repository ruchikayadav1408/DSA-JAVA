//https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/0

/*
delete n nodes after m nodes
The input list will have at least one element  
Node is defined as
  class Node
  {
      int data;
      Node next;
      Node(int data)
      {
          this.data = data;
          this.next = null;
      }
  }
*/

class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
         Node curr = head, t; 
    int count; 
  
    // The main loop that traverses
    // through the whole list 
    while (curr!=null) 
    { 
        // Skip M nodes 
        for (count = 1; count < M && curr != null; count++) 
            curr = curr.next; 
  
        // If we reached end of list, then return 
        if (curr == null) 
            return; 
  
        // Start from next node and delete N nodes 
        t = curr.next; 
        for (count = 1; count <= N && t != null; count++) 
        { 
            Node temp = t; 
            t = t.next; 
        } 
          
        // Link the previous list with remaining nodes 
        curr.next = t; 
  
        // Set current pointer for next iteration 
        curr = t; 
    }
}
}

