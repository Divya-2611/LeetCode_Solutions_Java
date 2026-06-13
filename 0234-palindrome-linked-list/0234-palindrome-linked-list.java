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

 //Approach -> Find out middle of linked list and reverse that portion and check value but in this approach we are modifing pur LL alternate is using stack but it will change SC from O(1) to O(n)
class Solution {
    public boolean isPalindrome(ListNode head) {
      //Find middle of linked list
      ListNode slow=head;
      ListNode fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
     slow=reverseList(slow);
     fast=head;
     while(slow!=null){
        if(fast.val!=slow.val) return false;
        slow=slow.next;
        fast=fast.next;
     }
     return true;
    }
    private ListNode reverseList(ListNode slow){
        if(slow==null || slow.next==null) return slow;
        ListNode head=reverseList(slow.next);
        slow.next.next=slow;
        slow.next=null;
        return head;
        
    }
}