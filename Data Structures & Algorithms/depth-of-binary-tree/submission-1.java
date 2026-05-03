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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Stack<Pair<TreeNode,Integer>> s = new Stack<>();
        s.add(new Pair(root,1));
        int res = 0;
        while(!s.isEmpty()){
            Pair<TreeNode,Integer> p = s.pop();
            TreeNode node = p.getKey();
            int depth = p.getValue();
            res = Math.max(res,depth);
            if(node.left != null) s.add(new Pair(node.left, depth+1));
            if(node.right != null) s.add(new Pair(node.right, depth+1));
        }
        return res;

    }
}
