# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution(object):
    def swapPairs(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        # Create a dummy node to simplify handling edge cases
        dummy = ListNode(0)
        dummy.next = head
        prev = dummy

        while head and head.next:
            # Nodes to be swapped
            first_node = head
            second_node = head.next

            # Swapping
            prev.next = second_node
            first_node.next = second_node.next
            second_node.next = first_node

            # Move to the next pair
            prev = first_node
            head = first_node.next

        return dummy.next
