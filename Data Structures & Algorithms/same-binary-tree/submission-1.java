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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<Pair<TreeNode,TreeNode>> s = new Stack<>();
        s.push(new Pair(p,q));
        while(!s.isEmpty()){
            Pair<TreeNode,TreeNode> n = s.pop();
            TreeNode node1 = n.getKey();
            TreeNode node2 = n.getValue();
            if(node1 == null && node2 == null) continue;
            if(node1 == null || node2 == null || node1.val != node2.val) return false;
            s.push(new Pair(node1.right,node2.right));
            s.push(new Pair(node1.left,node2.left));
        }
        return true;
    }
}
