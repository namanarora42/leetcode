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
        ListNode currentTarget = null;
        ListNode pointer = head;
        ListNode dummy = new ListNode(0, head);
        int i = 0;
        while (pointer != null) {
            if (i+1 == n) {
                currentTarget = (currentTarget == null ? dummy : currentTarget.next);
                i--;
            }
            pointer = pointer.next;
            i++;
        }
        if (currentTarget.equals(dummy)) {
            head = head.next;
            return head;
        }
        
        currentTarget.next = (currentTarget.next == null ? null : currentTarget.next.next);
        
        return head;
    }
}