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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        ListNode sol = lists[0];
        for(int i = 1; i < lists.length; i++){
            ListNode temp = lists[i];
            sol = mergeSortedList(sol, temp);
        }
        return sol;
    }
    ListNode mergeSortedList(ListNode l1, ListNode l2){
        ListNode sol = new ListNode(0);
        ListNode temp = sol;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                temp.next = l1;
                l1 = l1.next;
                }
            else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        if(l1 == null) temp.next = l2;
        if(l2 == null) temp.next = l1;
        return sol.next;
    }
}