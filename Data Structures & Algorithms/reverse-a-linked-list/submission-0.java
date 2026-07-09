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
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode nn=null, pn=null, cn=head;
        while(cn!=null){
            nn=cn.next;
            cn.next=pn;
            pn=cn;
            cn=nn;
        }
        return pn;
    }
}
