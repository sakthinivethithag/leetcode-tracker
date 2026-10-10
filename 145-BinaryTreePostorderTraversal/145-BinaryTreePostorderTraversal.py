# Last updated: 10/10/2026, 11:32:43 AM
class Solution(object):
    def postorderTraversal(self, root):
        result = []

        def postorder(node):
            if not node:
                return
            postorder(node.left)
            postorder(node.right)
            result.append(node.val)

        postorder(root)
        return result