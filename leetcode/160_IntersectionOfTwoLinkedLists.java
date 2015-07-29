/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        ListNode head;
        Set<ListNode> visitedNodes = new HashSet<ListNode>();
        
        for (head = headA; head != null; head = head.next) {
            visitedNodes.add(head);
        }
        
        for (head = headB; head != null; head = head.next) {
            if ( visitedNodes.contains(head) ) {
                break;
            }
        }
        
        return head;
    }
}
