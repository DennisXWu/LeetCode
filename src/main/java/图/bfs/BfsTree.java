package 图.bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wxg on 2020/9/13.
 */
public class BfsTree {

    public static void main(String[] args) {
        TreeNode rootNode = buildTree();
        bfs(rootNode);
    }

    public static void bfs(TreeNode node) {
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print("->" + current.getVal());
            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }

            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
    }

    public static TreeNode buildTree() {
        TreeNode head = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        head.right = three;
        head.left = second;
        second.right = five;
        second.left = four;
        three.right = seven;
        three.left = six;
        return head;
    }
}
