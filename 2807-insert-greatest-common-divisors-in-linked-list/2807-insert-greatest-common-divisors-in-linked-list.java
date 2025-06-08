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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null)
            return head;
        
        ListNode curr = head;
        while(curr != null && curr.next != null){
            int g = gcd(curr.val, curr.next.val);
            ListNode temp = new ListNode(g);
            temp.next = curr.next;
            curr.next = temp;
            curr = temp.next;
        }
        return head;
    }

    int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
}