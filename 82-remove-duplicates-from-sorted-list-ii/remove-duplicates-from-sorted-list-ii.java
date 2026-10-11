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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode temp=dummy;
        ListNode cur=head;
        while(cur!=null){
            if(cur.next==null || cur.val!=cur.next.val){
                temp.next=cur;
                temp=cur;
                cur=cur.next;
            }
            else{
                ListNode j=cur.next;
                while(j!=null && cur.val == j.val){
                    j=j.next;
                }
                cur=j;
            } 
        }
        temp.next=cur;
        return dummy.next;
    }
}