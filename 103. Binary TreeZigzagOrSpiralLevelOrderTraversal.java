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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<TreeNode> q=new LinkedList<>();
       int c=0;
        if(root==null)
            return result;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> l1= new ArrayList<>();
          for(int i=0;i<size;i++)
          {
                TreeNode curr=q.poll();
                if(c%2==0){
                   l1.add(curr.val);
                }
                else {
                  l1.add(0,curr.val);
                }
                 if(curr.left!=null)
                    q.add(curr.left);
                 if(curr.right!=null)
                    q.add(curr.right);
          }   
            c++;
            result.add(l1);
        }
        
        return result;
    }
}
