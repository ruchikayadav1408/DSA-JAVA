
/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
       Node temp= head;
    	int size=0;
    	while(temp!= null){
    	    temp=temp.next;
    	    size++;
    	}
    	
    	if(size<n){
    	    return -1;
    	}
    	if(n==size){
            return head.data;
        }
    	
    	int val=0;
    	temp=head;
    	
    	for(int i=1;i<size-n+1;i++){
    	   
    	    temp=temp.next;
    	    val=temp.data;
    	}
    	return val;
    }
}
