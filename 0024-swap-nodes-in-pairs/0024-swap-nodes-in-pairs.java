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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode sol = new ListNode(0, head);
        ListNode prev = sol;

        while( head != null && head.next != null){
            ListNode left = head;
            ListNode right = head.next;

            prev.next = right;
            left.next = right.next;
            right.next = left;

            prev = left;
            head = left.next;
        }
        return sol.next;
    }
}