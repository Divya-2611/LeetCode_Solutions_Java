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

 //Recursion
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;   ///Base Condition
        ListNode newHead=reverseList(head.next); //it will give newHead
        head.next.next=head; //Interchangeing
        head.next=null;   //otherwise keep repeating elements
        return newHead;
        
    }
}