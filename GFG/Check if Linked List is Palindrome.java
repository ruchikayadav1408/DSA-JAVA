class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
         if(head==null || head.next==null){
            return true;
            
        }
        Node midNode=findmid(head);
        //reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
         while(curr!=null){
             next=curr.next;
             curr.next=prev;
            prev=curr;
             curr=next;
         }
        
        Node right=prev;
        Node left= head;
         while(right!=null){
             if(left.data!=right.data){
                 return false;
                 
             }
             left=left.next;
             right=right.next;
         }
        return true;
    }
     public Node findmid(Node head){
        Node slow= head;
        Node fast=head;
         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;      
         }
        return slow;
    } 
}
