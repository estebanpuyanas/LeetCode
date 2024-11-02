from typing import Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:

        # Creates two new nodes currentNode and dummyNode, both which have a default value and next of 0 and None,
        # respectively.
        currentNode = dummyNode = ListNode()

        # While both list1 and list2 are non-empty:
        while list1 and list2:
            # If the current value of list 1 is smaller than the value in list 2,
            # append list 1 to the merged list,
            # move list1 and currentNode to their next respective pointers.
            if list1.val < list2.val:
                currentNode.next = list1  # this is appending to the merged list
                list1, currentNode = list1.next, list1  # this moves list1 and currentNode to their next pointers
            else:
                # Otherwise, append list2 to the merged list and move list2 and currentNode to their enxt respective
                # pointers
                currentNode.next = list2
                list2, currentNode = list2.next, list2

        # Once the loop has finished running, if list1 or list2 sitll have elements left, you append the rest of the
        # non-empty list to the rest of the merged list.
        if list1 or list2:
            currentNode.next = list1 if list1 else list2

        # Return the dummyNode, as this is the pointer to the mergedList. This is becasue currentNode and dummyNode ==
        # But since dummyNode was never changed, it points to currentNode, which is itself pointing to the front of the merged list.
        return dummyNode.next
