package LeetCode.数据结构.树;

/**
 * Created by wxg on 2021/1/11.
 */

//验证二叉搜索树
public class LeetCode98 {

    public static void main(String[] args) {
        LeetCode98 leetCode98 = new LeetCode98();
        TreeNode treeNode = leetCode98.construct();
        System.out.println(leetCode98.isValidBST(treeNode, null, null));
    }

    public boolean isValidBST(TreeNode root, Integer leftMax, Integer rightMin) {

        if (root == null) return true;

        int val = root.val;

        if (leftMax != null && val <= leftMax) {
            return false;
        }

        if (rightMin != null && val >= rightMin) {
            return false;
        }
        return isValidBST(root.left, leftMax, val) && isValidBST(root.right, val, rightMin);
    }

    public TreeNode construct() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = null;
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
