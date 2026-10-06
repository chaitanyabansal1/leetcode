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
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==1){
            head=temp=null;
            return head;
        }
        if(size==n){
          head=head.next;
          return head;
        }
        temp=head;
        int tar=size-n;
        for(int i=1;i<tar;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}