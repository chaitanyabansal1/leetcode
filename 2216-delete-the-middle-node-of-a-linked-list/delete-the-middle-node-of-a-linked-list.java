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
    public ListNode deleteMiddle(ListNode head) {
    
    //   ListNode temp=head;
    //   int size=0;
    //   while(temp!=null){
    //      temp=temp.next;
    //      size++;
    //   }
    //   if(size==1){
    //     head=temp=null;
    //     return head;
    //   }
    //   temp=head;
    //   for(int i=1;i<size/2;i++){
    //     temp=temp.next;
    //   }
    //   temp.next=temp.next.next;
    //   return head;

     ListNode s=head;
     ListNode f=head;
     if(s.next==null){
        head=null;
        return head;
     }
    //  if(s.next.next==null){
    //     s.next=null;
    //     return head;
    //  }
     while(f.next.next!=null && f.next.next.next!=null) {
        s=s.next;
        f=f.next.next;
     }  
     s.next=s.next.next;
     return head;
    }
}