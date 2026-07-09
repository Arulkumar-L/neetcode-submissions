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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<Integer> list = new LinkedList<>();
        ListNode temp=list1;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        temp=list2;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(list);
        if(list.size()==0){
            return null;
        }
        ListNode list3= new ListNode(list.get(0));
        temp=list3;
        for(int i=1;i<list.size();i++){
            ListNode nn=new ListNode(list.get(i));
            temp.next=nn;
            temp=nn;
        }
        return list3;
    }
}