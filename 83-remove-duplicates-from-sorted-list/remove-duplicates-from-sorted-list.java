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
          ListNode i=head;
          ListNode j=head;
          if (head == null) {
        return null;
        }
          while(j!=null){
            if(i.val==j.val){
                j=j.next;
            }
            else{
            i.next=j;
            i=j;
            j=j.next;}
          }
          i.next=null;
          
          return head;
        // ListNode temp=head;
        // if(temp==null){
        //     return null;
        // }
        // if(temp.next==null){
        //     return temp;
        // }
        // while(temp!=null && temp.next!=null){
        //     if(temp.val==temp.next.val){
        //         temp.next=temp.next.next;
        //     }
        //     else
        //     temp=temp.next;
            
        // }
        // return head;
    }
}