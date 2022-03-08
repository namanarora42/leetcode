/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head==null) {
            return false;
        }
        ListNode ptr = head;
        ListNode ptr2 = head.next;
        boolean flag = true;
        while (ptr2 != null && ptr != null && ptr != ptr2) {
            if (!flag) {
                ptr = ptr.next;
                ptr2 = ptr2.next;
                flag = true;
            }
            else {
                ptr2 = ptr2.next;
                flag = false;
            }
        }
        if (ptr == ptr2) {
            return true;
        }
        return false;
    }
}