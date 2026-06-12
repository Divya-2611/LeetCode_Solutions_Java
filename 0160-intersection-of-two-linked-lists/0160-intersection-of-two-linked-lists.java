/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//Approach->1.Find the length of two linked list 2.Move the bigger list to m-n steps where m=size of bigger list and n=size of smaller list
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m=0;
        int n=0;
        ListNode hA=headA;
        ListNode hB=headB;
        while(hA!=null){
            m++;
            hA=hA.next;
        }
        while(hB!=null){
            n++;
            hB=hB.next;
        }
        hA=headA;
        hB=headB;
        if(m>n){
            int diff=m-n;
            for(int i=1;i<=m-n;i++){
                hA=hA.next;
            }
        }
        else{
            int diff=n-m;
            for(int i=1;i<=n-m;i++){
                hB=hB.next;
            }
        }
        while(hA!=hB){
            hA=hA.next;
            hB=hB.next;
        }
        return hA;
    }
}