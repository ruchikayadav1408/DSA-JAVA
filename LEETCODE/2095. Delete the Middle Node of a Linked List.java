class Solution {
    public ListNode deleteMiddle(ListNode head) {
         if(head.next == null) {
            return head.next;
        }
          ListNode  slow= head;
            ListNode fast=head.next.next;
         
            while(fast !=null && fast.next!=null){
               
                slow=slow.next;//+1
                fast=fast.next.next;//+2
            }
            slow.next=slow.next.next;
            return head;
    }
}
