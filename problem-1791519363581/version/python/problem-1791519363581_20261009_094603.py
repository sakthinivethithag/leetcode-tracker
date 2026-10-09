# Last updated: 10/9/2026, 9:46:03 AM
1class Solution(object):
2    def preorderTraversal(self, root):
3        result = []
4        def preorder(node):
5            if not node:
6                return
7            result.append(node.val)
8            preorder(node.left)
9            preorder(node.right)
10        preorder(root)
11        return result