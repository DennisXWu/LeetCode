package offer;

/**
 * Created by wxg on 2020/12/30.
 */
public class Offer55_2 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int leftRight = solve(root.left);
        int rightHeight = solve(root.right);

        if (Math.abs(rightHeight - leftRight) > 1) {
            return false;
        } else {
            return isBalanced(root.right) && isBalanced(root.left);
        }
    }

    private int solve(TreeNode node) {
        if (node == null) return 0;
        return Math.max(solve(node.left), solve(node.right)) + 1;
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
