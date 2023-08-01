Finding middle element in a linked list
https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/0

class Solution
{
    int getMiddle(Node head)
    {
         // Your code here.
         Node  slow= head;
            Node fast=head;
            while(fast !=null && fast.next!=null){
                slow=slow.next;//+1
                fast=fast.next.next;//+2
            }
            return slow.data;
    }
}

