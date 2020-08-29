package 查找.BinarySearchTree;

import com.google.gson.Gson;

/**
 * Created by wxg on 2020/8/29.
 */
public class SearchBST {
    public static void main(String[] args) {
        int[] values = {7, 5, 9, 2, 11, 6};
        Node rootNode = BuildBST.buid(values);
        System.out.println(new Gson().toJson(search(rootNode, 5)));
    }

    private static Node search(Node node, int num) {
        if (node == null) {
            return null;
        }

        if (num == node.getValue()) {
            return node;
        } else if (num < node.getValue()) {
            return search(node.getLeftNode(), num);
        } else {
            return search(node.getRightNode(), num);
        }
    }
}
