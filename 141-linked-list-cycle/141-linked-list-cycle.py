# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head is None:
            return False
        ptr = head
        ptr2 = head.next
        while ((ptr is not None) & (ptr2 is not None) & (ptr != ptr2)):
            try:
                ptr2 = ptr2.next.next
                ptr = ptr.next
            except:
                return False
        if ptr == ptr2:
            return True
        return False
            

            