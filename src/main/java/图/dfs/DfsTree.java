package 图.dfs;

import 图.bfs.TreeNode;

import java.util.Stack;

/**
 * Created by wxg on 2020/9/13.
 */

//二叉树的深度优先遍历
public class DfsTree {

    public static void main(String[] args) {
        TreeNode rootNode = buildTree();
        dfsWithOutRecusive(rootNode);
    }

    public static void dfsWithRecusive(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print("->" + node.getVal());
        dfsWithRecusive(node.getLeft());
        dfsWithRecusive(node.getRight());
    }


    public static void dfsWithOutRecusive(TreeNode node) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.print("->" + current.getVal());
            if (current.getRight() != null) {
                stack.push(current.getRight());
            }
            if (current.getLeft() != null) {
                stack.push(current.getLeft());
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
