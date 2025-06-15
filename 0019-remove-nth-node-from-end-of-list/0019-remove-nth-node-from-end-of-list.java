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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = new ListNode(0, head);
        ListNode curr = head;
        for(int i = 0; i < n; i++){
            curr = curr.next;
        }
        ListNode l = temp;
        while(curr != null){
            curr = curr.next;
            l = l.next;
        }
        l.next = l.next.next;
        return temp.next;    
    }
}