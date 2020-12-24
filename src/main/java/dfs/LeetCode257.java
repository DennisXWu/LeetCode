package dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2020/12/24.
 */
public class LeetCode257 {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        LeetCode257 leetCode257 = new LeetCode257();
        leetCode257.binaryTreePaths(construct());

        for (String str : list) {
            System.out.println(str);
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return list;
    }


    public void dfs(TreeNode node, String str) {

        if (node == null) return;

        str = str + node.val;

        if (node.right == null && node.left == null) {
            list.add(str);
        }

        dfs(node.left, str + "->");
        dfs(node.right, str + "->");
    }

    public static TreeNode construct() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        return root;
    }
}
