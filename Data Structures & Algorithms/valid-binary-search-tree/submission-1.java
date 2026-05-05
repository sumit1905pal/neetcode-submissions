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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        if(!checkAllLeft(root.left,root.val)) return false;

        if(!checkAllRight(root.right,root.val)) return false;

        return isValidBST(root.left) && isValidBST(root.right);
    }

    private boolean checkAllLeft(TreeNode node, int val){
        if(node == null) return true;

        if(node.val >= val) return false;

        return checkAllLeft(node.left,val) && checkAllLeft(node.right,val);
    }

    private boolean checkAllRight(TreeNode node, int val){
        if(node == null) return true;

        if(node.val <= val) return false;

        return checkAllRight(node.left,val) && checkAllRight(node.right,val);
    }
}
