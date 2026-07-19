// Last updated: 7/19/2026, 4:07:43 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int countDominantNodes(TreeNode root) {
        int[] count=new int[1];
        dfs(root,count);
        return count[0];
    }
    private int dfs(TreeNode node,int[] count){
        if(node==null)
            return Integer.MIN_VALUE;
        int leftMax=dfs(node.left,count);
        int rightMax=dfs(node.right,count);
        int maxVal=Math.max(node.val,Math.max(leftMax,rightMax));
        if(node.val==maxVal)
            count[0]++;
        return maxVal;
    }
}