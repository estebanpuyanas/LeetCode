
class Solution {

  /**
   * Function that reverses a linked list.
   * @param head the first node of the list.
   * @return the list in reverse order.
   */
  public ListNode reverseList(ListNode head) {
    ListNode previousNode = null;

    /**
     * While the head of the list is not null, iterate through it, and do the folllowing operations:
     *  1. set the node 'next' to be whatever is right after the head, so in the example it would be:
     *    head  = 1, next = 2, head.next = 2
     *  2. Set head.next to previous node, which at the time is currently null.
     *  3. The previous node gets the value of the head node.
     *  4. Head becomes next.
     */
    while (head != null) {
      ListNode next = head.next;
      head.next = previousNode;
      previousNode = head;
      head = next;
    }
    return previousNode;
  }
}
