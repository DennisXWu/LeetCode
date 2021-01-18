package 剑指Offer;

/**
 * Created by wxg on 2020/12/22.
 */
public class Offer55_1 {

    public int maxDepth(TreeNode root) {

        if (root == null) return 0;

       return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
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
