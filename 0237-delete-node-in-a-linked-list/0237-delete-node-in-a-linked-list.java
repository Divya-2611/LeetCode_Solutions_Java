/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;

        
    }
}
// TC ->O(1)
// SC -> O(1)
// approach ->we have to put the value of node.next into node and delete that node.next