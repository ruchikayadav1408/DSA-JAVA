//https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/0
/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node list1, Node list2) {
     // This is a "method-only" submission. 
     // You only need to complete this method
      Node mergeLL= new Node(-1);
        Node temp= mergeLL;

        while(list1 != null && list2!= null){
            if(list1.data<=list2.data){
                temp.next= list1;
                list1=list1.next;

            }
            else{
                temp.next= list2;
                list2=list2.next;
    
            }
            temp=temp.next;
            
        }
        if (list1 == null) {
            temp.next = list2;
        }
        else if (list2 == null) {
            temp.next = list1;
        }
        return mergeLL.next;
   } 
}
