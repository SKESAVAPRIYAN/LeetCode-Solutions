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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> li=new ArrayList<>();
        while(list1!=null){
            li.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            li.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(li);
        ListNode ni=new ListNode(-1);
        ListNode head=ni;
        for(int i:li){
            ni.next=new ListNode(i);
            ni=ni.next;
        }
        head=head.next;
        return head;
        
    }
}