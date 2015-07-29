/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        
        ListNode p1 = head;
        int length = 0;
        while (p1 != null) {
            length++;
            p1 = p1.next;
        }
        int offset = k % length;
        if (offset == 0) return head;
        
        p1 = head;
        int i = 0;
        while (i < offset) {
            p1 = p1.next;
            i++;
        }
        ListNode p2 = head;
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = head;
        head = p2.next;
        p2.next = null;
        
        return head;
    }
}
