public class Solution {
    public ListNode RemoveElements(ListNode head, int val) {
        // Step 1: Handle empty list
        if (head == null) {
            return null;
        }

        // Step 2: Remove matching head nodes
        while (head != null && head.val == val) {
            head = head.next;
        }

        // Step 3: Iterate through the list
        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            // Step 4: Remove matching nodes
            if (current.val == val) {
                previous.next = current.next;
            } else {
                previous = current;
            }
            current = current.next;
        }

        // Step 5: Return new head
        return head;
    }
}
