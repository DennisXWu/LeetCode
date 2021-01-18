package 剑指Offer;

import java.util.*;

/**
 * Created by wxg on 2020/12/9.
 */
public class Offer32_1 {

    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[]{};
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                continue;
            }
            list.add(node.val);
            queue.add(node.left);
            queue.add(node.right);
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
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
