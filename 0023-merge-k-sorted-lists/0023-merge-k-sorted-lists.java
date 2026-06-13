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

 //Requirements->Binary search approach,divide and conquere, merge 2 list
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        return mergeKListsHelper(lists,0,lists.length-1);   
    }
    //Helper method 
    private ListNode mergeKListsHelper(ListNode lists[],int start,int end){
        if(start==end) return lists[start];  //If only one list is given
        if(start+1==end) return merge2Lists(lists[start],lists[end]);  ///If only 2 list is given
        int mid=start+(end-start)/2;
        ListNode left=mergeKListsHelper(lists,start,mid);
        ListNode right=mergeKListsHelper(lists,mid+1,end);
        return merge2Lists(left,right);
    }
    //Merge 2 sorted list
    private ListNode merge2Lists(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        while(l1!=null && l2!=null){
            if(l1.val>=l2.val){
                temp.next=l2;
                l2=l2.next;
            }
            else{
                temp.next=l1;
                l1=l1.next;
            }
            temp=temp.next;
            
           
        }
            if(l1==null){
                temp.next=l2;
            }
            if(l2==null){
                temp.next=l1;
            }
        return dummy.next;
    }
}