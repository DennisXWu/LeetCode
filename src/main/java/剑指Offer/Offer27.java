package 剑指Offer;

/**
 * Created by wxg on 2020/12/8.
 */
public class Offer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;

        TreeNode l = mirrorTree(root.left);
        TreeNode r = mirrorTree(root.right);

        root.left = r;
        root.right = l;

        return root;
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
