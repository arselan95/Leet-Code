/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        int h=0;
        if(root==null)
        {
            return 0;
        }
        int left= maxDepth(root.left);
        int right= maxDepth(root.right);
        
        if(left > right)
        {
             h= 1+left;
        }
        else{
             h=1+right;
        }
        return h;
        
    }
}