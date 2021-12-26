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
        // Comparator byValue = (ListNode l1, ListNode l2) -> Integer.compare(l1.val, l2.val);
        Comparator byValue = new ListNodeComparator();
        ListNode outList = null, lastVal = null;
        List<ListNode> values = new LinkedList<ListNode>();
        for (ListNode each : lists) {
            if (each != null) {
                values.add(each);
            }
        }
        // values = Arrays.asList(lists);
        while (!values.isEmpty()) {
            ListNode maxVal = Collections.min(values, byValue);
            if (maxVal == null) {
                return outList;
            }
            if (outList == null) {
                outList = new ListNode(maxVal.val);
                lastVal = outList;
            }
            else {
                lastVal.next = maxVal;
                lastVal = lastVal.next;
            }
            if (maxVal.next == null) {
                values.remove(maxVal);
            }
            else {
                values.set(values.indexOf(maxVal), maxVal.next);
            }
        }
        return outList;
    }
    
    class ListNodeComparator implements Comparator<ListNode> {
        @Override
        public int compare(ListNode l1, ListNode l2) {
            return Integer.compare(l1.val, l2.val);
        }
    } 
}