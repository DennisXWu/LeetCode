package offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2020/12/29.
 */
public class Offer54 {
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        Offer54 offer54 = new Offer54();
        System.out.println(offer54.kthLargest(root, 1));

    }

    public int kthLargest(TreeNode root, int k) {
        helper(root);
        return list.get(list.size() - k);
    }

    public void helper(TreeNode root) {
        if (root == null) {
            return;
        }
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
