from typing import Optional

from python.ListNode import ListNode

class Solution:

    # Function that reverses a linked list.
    def reverse_list(self, head: Optional[ListNode]) -> Optional[ListNode]:

        # Create  a dummy previousNode, initially null. Point the currentNode to the head of the list. 
        previousNode = None
        currentNode = head

        while currentNode is not None:

            # Advance every pointer into its next node: next becomes the next of current. current.next = previous (no longer null), previous = current, current = next.
            nextNode = currentNode.next
            currentNode.next = previousNode
            previousNode = currentNode
            currentNode = nextNode

        # Return the last node of the list.
        return previousNode
