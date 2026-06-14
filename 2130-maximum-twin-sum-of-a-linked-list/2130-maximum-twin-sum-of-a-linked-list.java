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
 // Deee there is also one approach that we have use in palindrome linkedlist i.e. reverse half of ll 
class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
            size++;
        }
        int sum=0;
        for(int i=0;i<size/2;i++){
            sum=Math.max(sum,(st.get(i)+st.pop()));
        }
        return sum;
    }
}