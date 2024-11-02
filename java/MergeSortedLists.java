/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    /**
     * Steps:
     * 1. Make new head node.
     * 2. Set the next node to min(list1.val, list2.val)
     */

    // starting temporary node.
    // This gets used to compute all the work but is not returned at the end of the problem.
    ListNode tempNode = new ListNode(0);

    // The current node begins at the temporary node.
    ListNode currentNode = tempNode;

    // While the lists are not null, keep traversing through them.
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        // the next node to currentNode becomes list1 and list1 becomes list1.next to keep traversing
        currentNode.next = list1;
        list1 = list1.next;
        // do the same operation but for the other list.
      } else {
        currentNode.next = list2;
        list2 = list2.next;
      }
      currentNode = currentNode.next;
    }

    // Accounting for edge cases with lists of different length.
    if (list1 != null) {
      currentNode.next = list1;
      list1 = list1.next;
    }

    // Accounting for edge cases with lists of different length.
    if (list2 != null) {
      currentNode.next = list2;
      list2 = list2.next;
    }

    // This is the actual head of the list.
    return tempNode.next;
  }
}
