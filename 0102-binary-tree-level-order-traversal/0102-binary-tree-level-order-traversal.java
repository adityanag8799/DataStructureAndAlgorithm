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
        List<List<Integer>> result= new ArrayList<>();
        if(root==null) return result;
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> level = new ArrayList<>();
        queue.add(root);
        int size=0;
        while(!queue.isEmpty())
        {
        size=queue.size();
        level=new ArrayList<>();
        while(size-->0)
        {
        TreeNode node=queue.poll();
        if(node.left!=null) queue.offer(node.left);
        if(node.right!=null) queue.offer(node.right);
        level.add(node.val);
        }
        result.add(level);
        }
        return result;

    }
}