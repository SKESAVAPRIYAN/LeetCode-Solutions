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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        ListNode i=head;
        ListNode j=head.next;
        while(i!=null && j!=null){
            int temp=i.val;
            i.val=j.val;
            j.val=temp;
            i=(j.next!=null)?j.next:null;
            j=(i!=null)?i.next:null;
        }
        return head;
        
    }
}