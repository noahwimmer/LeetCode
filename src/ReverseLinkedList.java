import ListNode.ListNode;
// Given the head of a singly linked list, reverse the list, and return the reversed list.

// O(n) time
// O(1) space
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head != null ? head.next : null;

        while(cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
