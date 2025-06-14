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
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        ListNode runner = head;
        ListNode curr = head;
        while(runner != null && runner.next != null){
            curr = curr.next;
            runner = runner.next.next;
        }
        return curr;
    }
}