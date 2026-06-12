/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //Approach->1.Whene slow==fast then break the loop.  2.start from slow and head till they become equal and return
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            slow=slow.next;
            if(fast.next==null) return null;
            fast=fast.next.next;
            if(fast==slow){
                ListNode temp=head;
        while(slow!=temp){
            slow=slow.next;
           temp=temp.next;
        }
        return slow;
            }
        }
        return null;
        
    }
}