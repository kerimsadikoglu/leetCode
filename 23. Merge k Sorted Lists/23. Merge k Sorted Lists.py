import heapq

class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def mergeKLists(self, lists):
        """
        :type lists: List[ListNode]
        :rtype: ListNode
        """

        # Create a comparator for the priority queue
        class Wrapper:
            def __init__(self, node):
                self.node = node

            def __lt__(self, other):
                return self.node.val < other.node.val

        # Initialize a priority queue
        pq = []

        # Add the first node of each list to the priority queue
        for l in lists:
            if l:
                heapq.heappush(pq, Wrapper(l))

        # Create a dummy head for the result list
        dummy = ListNode()
        current = dummy

        # Merge the lists
        while pq:
            node = heapq.heappop(pq).node
            current.next = node
            current = current.next
            if node.next:
                heapq.heappush(pq, Wrapper(node.next))

        return dummy.next
