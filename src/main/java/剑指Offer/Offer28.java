package 剑指Offer;

/**
 * Created by wxg on 2020/12/8.
 */
public class Offer28 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return helper(root.right, root.left);
    }

    private boolean helper(TreeNode right, TreeNode left) {
        if (right == null && left == null) return true;
        if (right == null && left != null) return false;
        if (left == null && right != null) return false;

        return right.val == left.val && helper(right.left, left.right) && helper(right.right, left.left);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
