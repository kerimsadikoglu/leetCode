/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var dummy = ListNode(0)
        dummy.next = head
        var first: ListNode? = dummy
        var second: ListNode? = dummy
        
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (i in 1..n+1) {
            first = first!!.next
        }
        
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next
            second = second!!.next
        }
        
        second!!.next = second.next!!.next
        return dummy.next
    }
}