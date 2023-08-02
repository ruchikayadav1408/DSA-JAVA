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
    public ListNode mergeKLists(ListNode[] arr) {
         if(arr.length==0) return null;
         if(arr.length==1) return arr[0];
        int last= arr.length-1;
        while (last != 0) {
int i = 0, j = last;
while (i < j) {
arr[i] = SortedMerge(arr[i], arr[j]);
i++;
j--;
if (i >= j)
last = j;
}

}
return arr[0];
}

    
    public static ListNode SortedMerge(ListNode l1, ListNode l2){
         ListNode head=new ListNode(0);
        ListNode cur=head;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                cur.next=new ListNode(l1.val);
                l1=l1.next;
            }else{
                cur.next=new ListNode(l2.val);
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1==null){
            cur.next=l2;
        }else{
            cur.next=l1;
        }
        return head.next;
}


}
