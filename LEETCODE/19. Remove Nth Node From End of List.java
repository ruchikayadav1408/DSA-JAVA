//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next==null){
            return null;
        }
        int sz=0;
        ListNode temp= head;
        while(temp != null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head= head.next;
            return head;
        }
        int i=1;
        int iTofind= sz-n;
        ListNode prev= head;
        while(i<iTofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
      }
    }
