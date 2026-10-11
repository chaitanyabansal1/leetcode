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
    public ListNode rotateRight(ListNode head, int k) {


        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        k=k%size;
        if(k==0) return head;
        temp=head;
        int f=size-k;
        for(int i=1;i<f;i++){
            temp=temp.next;
        }
       ListNode newn=temp.next;
       temp.next=null;
       ListNode newt=newn;
       while(newt.next!=null){
        newt=newt.next;
       }
       newt.next=head;
       return newn;
    }

}