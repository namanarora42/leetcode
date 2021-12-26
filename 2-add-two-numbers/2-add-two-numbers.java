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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        int carry = 0;
        ListNode output = null;
        ListNode nextPointer = null;
        int result = 0;
        while (true) {
            int num1 = (first != null ? first.val : 0);
            int num2 = (second != null ? second.val : 0);
            result = num1 + num2 + carry;
            if (result >= 10) {
                result = result - 10;
                carry = 1;
            }
            else {
                carry = 0;
            }
            if (output == null) {
                output = new ListNode(result);
                nextPointer = output;
            }
            else {
                nextPointer.next = new ListNode(result);
                nextPointer = nextPointer.next;
            }
            first = (first == null ? null : first.next);
            second = (second == null ? null : second.next);
            if (first == null && second == null) {
                if (carry == 1) {
                    nextPointer.next = new ListNode(1);
                }
                break;
            }
        }
        return output;
    }
}