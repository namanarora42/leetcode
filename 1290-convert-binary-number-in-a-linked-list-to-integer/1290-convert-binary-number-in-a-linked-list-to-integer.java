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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(curr.val);
            // i++;
            curr = curr.next;
            if (curr == null) {
                break;
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}