package 查找.BinarySearchTree;

import com.google.gson.Gson;

/**
 * Created by wxg on 2020/8/27.
 */
public class BuildBST {
    private static Node rootNode = null;

    public static void main(String[] args) {
        int[] nums = {7, 5, 9, 2, 11, 6};
        System.out.println(new Gson().toJson(buid(nums)));
    }

    public static Node buid(int[] values) {
        for (int val : values) {
            assemble(rootNode, val);
        }
        return rootNode;
    }

    private static void assemble(Node node, int val) {
        if (node == null) {
            rootNode = new Node(val);
        } else {
            if (val < node.getValue()) {
                Node leftNode = node.getLeftNode();
                if (leftNode == null) {
                    node.setLeftNode(new Node(val));
                } else {
                    assemble(leftNode, val);
                }
            } else {
                Node rightNode = node.getRightNode();
                if (rightNode == null) {
                    node.setRightNode(new Node(val));
                } else {
                    assemble(rightNode, val);
                }
            }
        }
    }
}
