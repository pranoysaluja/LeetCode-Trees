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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        return 0;
        int lh=maxheight(root.left);
        int rh=maxheight(root.right);
        int rootDia=(lh+rh);//root Diameter
        
        int leftDia=diameterOfBinaryTree(root.left);//left Diameter
        int rightDia=diameterOfBinaryTree(root.right);//Right Diameter
        
        return Math.max(rootDia,Math.max(leftDia,rightDia));  
    }
    int maxheight(TreeNode root)
    {
        if(root==null)
        return 0;
        int lh=maxheight(root.left);
        int rh=maxheight(root.right);
        
        return 1+Math.max(lh,rh);
    }
    
}
