package LeetCode.数据结构.树.high;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2021/3/10.
 */
public class LeetCode145_medium {

    List<Integer> list = new ArrayList<Integer>();

    public List<Integer> postorderTraversal(TreeNode root) {
        solve(root);
        return list;
    }

    public void solve(TreeNode node) {
        if (node == null) return;

        solve(node.left);

        solve(node.right);
        list.add(node.val);
    }
}
