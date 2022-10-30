//https://leetcode.com/problems/palindrome-linked-list/
//Input: head = [1,2,2,1]
//Output: true


class Solution { 
    public ListNode findmid(ListNode head){
        ListNode slow= head;
        ListNode fast=head;
         while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;      
         }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
            
        }
        ListNode midNode=findmid(head);
        //reverse 2nd half
        ListNode prev=null;
        ListNode curr=midNode;
        ListNode next;
         while(curr!=null){
             next=curr.next;
             curr.next=prev;
            prev=curr;
             curr=next;
         }
        
        ListNode right=prev;
        ListNode left= head;
         while(right!=null){
             if(left.val!=right.val){
                 return false;
                 
             }
             left=left.next;
             right=right.next;
         }
        return true;
    }
    
}
