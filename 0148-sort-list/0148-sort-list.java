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
    public ListNode sortList(ListNode head) {
        List<Integer> li=new ArrayList<>();
        ListNode m=head;
        while(m!=null){
            li.add(m.val);
            m=m.next;
        }
        Collections.sort(li);
        ListNode ni=new ListNode(-1);
        ListNode h=ni;
        for(int i:li){
            ni.next=new ListNode(i);
            ni=ni.next;
        }
        h=h.next;
        return h;
    }
}