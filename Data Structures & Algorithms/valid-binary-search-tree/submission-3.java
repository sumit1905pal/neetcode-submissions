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
        Queue<Object[]> q = new LinkedList<>();
        q.offer(new Object[]{root, Long.MIN_VALUE, Long.MAX_VALUE});
        while(!q.isEmpty()){
            Object[] cur = q.poll();
            TreeNode node = (TreeNode)cur[0];
            long min = (long) cur[1];
            long max = (long) cur[2];
            if(!(min < node.val && max > node.val)) return false;
            if(node.left != null){
                q.offer(new Object[]{node.left, min,(long) node.val});
            }
            if(node.right != null){
                q.offer(new Object[]{node.right,(long) node.val, max});
            }
        }
        return true;
    }
}
