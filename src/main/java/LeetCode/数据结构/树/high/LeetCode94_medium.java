package LeetCode.数据结构.树.high;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2021/3/10.
 */
public class LeetCode94_medium {
    List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        solve(root);
        return list;

    }

    public void solve(TreeNode node) {
        if (node == null) return;

        solve(node.left);
        list.add(node.val);
        solve(node.right);

    }
}
