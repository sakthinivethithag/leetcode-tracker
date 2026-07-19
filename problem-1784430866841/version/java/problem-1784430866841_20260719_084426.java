// Last updated: 7/19/2026, 8:44:26 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    
18    public int countDominantNodes(TreeNode root) {
19        int[] count=new int[1];
20        dfs(root,count);
21        return count[0];
22    }
23    private int dfs(TreeNode node,int[] count){
24        if(node==null)
25            return Integer.MIN_VALUE;
26        int leftMax=dfs(node.left,count);
27        int rightMax=dfs(node.right,count);
28        int maxVal=Math.max(node.val,Math.max(leftMax,rightMax));
29        if(node.val==maxVal)
30            count[0]++;
31        return maxVal;
32    }
33}