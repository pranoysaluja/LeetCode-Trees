/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();
        Queue<Node> q=new LinkedList<>();
        if(root == null) return result;
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
             ArrayList<Integer> currentLevel = new ArrayList<Integer>(size);
            for(int i=0;i<size;i++)
            {
            Node curr=q.poll();
                currentLevel.add(curr.val);
                q.addAll(curr.children);
            }
            result.add(currentLevel);
        }
        return result;
    }
}
