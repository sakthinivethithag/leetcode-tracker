# Last updated: 10/10/2026, 11:32:46 AM
class Solution(object):
    def preorderTraversal(self, root):
        result = []
        def preorder(node):
            if not node:
                return
            result.append(node.val)
            preorder(node.left)
            preorder(node.right)
        preorder(root)
        return result