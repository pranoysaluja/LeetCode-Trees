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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root == null) return result;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
             ArrayList<Integer> currentLevel = new ArrayList<Integer>(size);
            for(int i=0;i<size;i++)
            {
            TreeNode curr=q.poll();
                currentLevel.add(curr.val);
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        
            }
            result.add(currentLevel);
        }
        return result;
    }
}
