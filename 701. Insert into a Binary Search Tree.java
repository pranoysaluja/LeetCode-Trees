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
    public TreeNode insertIntoBST(TreeNode root, int x) {
        if(root==null)
            return new TreeNode(x);
        if(root.val>x)
            root.left=insertIntoBST(root.left,x);
        else if(root.val<x)
            root.right=insertIntoBST(root.right,x);
     return root; 
    }
}
