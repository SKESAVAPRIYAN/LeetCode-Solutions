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
    public ListNode swapNodes(ListNode head, int k) {
    List<Integer> li=new ArrayList<>();
    ListNode cur=head;
    while(cur!=null){
        li.add(cur.val);
        cur=cur.next;
    } 
    int size=li.size();
    int t1=k-1;
    int t2=size-k;
    int temp=li.get(t1);
    li.set(t1,li.get(t2));
    li.set(t2,temp);
    int i=0;
    cur=head;
    while(cur!=null){
        cur.val=li.get(i);
        cur=cur.next;
        i++;
    }
    return head;
    }
}