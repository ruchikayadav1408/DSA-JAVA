/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        // code here
        Node prev=null;
        Node curr= head;
        Node next;
        
        while(curr!= null){
            next= curr.next;
            curr.next=prev;
            prev= curr;
            curr=next;
        }
        
        head= prev;
        return head;
    }
}
