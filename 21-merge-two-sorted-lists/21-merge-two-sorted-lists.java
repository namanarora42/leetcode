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
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode result = null;
        ListNode lastResult = null;
        int node1val;
        int node2val;
        while (node1 != null || node2 != null) {
            if (node1 == null) {
                while (node2 != null) {
                    if (result == null) {
                        result = new ListNode(node2.val);
                        lastResult = result;
                    }
                    else {
                        lastResult.next = node2;
                        lastResult = lastResult.next;
                    }
                    node2 = node2.next;
                }
                return result;
            }
            if (node2 == null) {
                while (node1 != null) {
                    if (result == null) {
                        result = new ListNode(node1.val);
                        lastResult = result;
                    }
                    else {
                        lastResult.next = node1;
                        lastResult = lastResult.next;
                    }
                        node1 = node1.next;
                }
                return result;
            }
            
            node1val = node1.val;
            node2val = node2.val;
            if (node1val < node2val) {
                if (result == null) {
                    result = new ListNode(node1val);
                    lastResult = result;
                }
                else {
                    lastResult.next = new ListNode(node1val);
                    lastResult = lastResult.next;
                }
                node1 = node1.next;
            }
            else {
                if (result == null) {
                    result = new ListNode(node2val);
                    lastResult = result;
                }
                else {
                    lastResult.next = new ListNode(node2val);
                    lastResult = lastResult.next;
                }
                node2 = node2.next;
            }
        }
        return result;
    }
}