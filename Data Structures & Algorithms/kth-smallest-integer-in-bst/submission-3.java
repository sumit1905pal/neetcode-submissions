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
    int cnt = 0;
    int ans = 0;
    public int kthSmallest(TreeNode root, int k) {
        cnt = k;
        inorder(root);
        return ans;
    }
    private void inorder(TreeNode node){
        if(node == null) return;

        inorder(node.left);
        if(cnt == 0) return;
        cnt--;
        if(cnt == 0){
            ans = node.val;
            return;
        }
        inorder(node.right);
    }
}
