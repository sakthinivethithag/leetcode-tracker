# Last updated: 10/10/2026, 11:32:48 AM
class Solution(object):
    def hasCycle(self, head):
        slow = head
        fast = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                return True
        return False