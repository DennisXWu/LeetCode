package LeetCode.数据结构.树.high;

/**
 * Created by wxg on 2020/12/24.
 */
public class LeetCode111_easy {

    public int minDepth(TreeNode root) {

        if (root == null) return 0;

        if (root.left == null && root.right != null) {
            return 1 + minDepth(root.right);
        }

        if (root.right == null && root.left != null) {
            return 1 + minDepth(root.left);
        }

        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
