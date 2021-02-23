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
    static int maxlevel;
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<Integer>();
        maxlevel=0;
        printRight(root,1,l);
        return l;
    }
    void printRight(TreeNode root,int level,List<Integer> l)
    {
        if(root==null)
            return;
        if(maxlevel<level)
        {
        l.add(root.val);
        //System.out.println(root.val);
        maxlevel=level;//maxlevel++
        }
        printRight(root.right,level+1,l);
        printRight(root.left,level+1,l);
    }
}
