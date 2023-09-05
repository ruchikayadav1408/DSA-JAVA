class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode  slow= head;
           ListNode fast=head;
            while(fast !=null && fast.next!=null){
                slow=slow.next;//+1
                fast=fast.next.next;//+2
            }
            return slow;
    }
}
