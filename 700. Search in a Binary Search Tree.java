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
    public TreeNode searchBST(TreeNode root, int x) {
        if(root == null) {
            return null;
        }
        
        if(root.val == x) {
            return root;
        }
        
        if(root.val > x) {
            return searchBST(root.left, x);
        }
        
        else {
            return searchBST(root.right, x);
    }
        
        // if(root==null || root.val==x)
       //  return root;
       //  if(root.val<x)
       //      root=searchBST(root.right,x);
       //  else
       //  root=searchBST(root.left,x);
       //  return root;

    }
}
