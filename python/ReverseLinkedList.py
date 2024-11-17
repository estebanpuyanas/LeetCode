from typing import Optional

from python.ListNode import ListNode

class Solution:

    # Function that reverses a linked list.
    def reverse_list(self, head: Optional[ListNode]) -> Optional[ListNode]:
        previousNode = None
        currentNode = head

        while currentNode is not None:
            nextNode = currentNode.next
            currentNode.next = previousNode
            previousNode = currentNode
            currentNode = nextNode

        return previousNode
