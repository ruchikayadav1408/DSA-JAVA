//https://leetcode.com/problems/reverse-linked-list/
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]

class Solution {
public ListNode reverseList(ListNode head) {

ListNode prev = null;
ListNode curr = head;
ListNode next;

while(curr != null) {
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
}
return prev;
}
}
