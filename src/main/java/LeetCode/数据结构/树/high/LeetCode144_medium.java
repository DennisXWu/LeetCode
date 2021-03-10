package LeetCode.数据结构.树.high;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2021/3/10.
 */
public class LeetCode144_medium {

    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        solve(root);
        return list;
    }


    public void solve(TreeNode root) {
        if (root == null) return;
        list.add(root.val);
        solve(root.left);
        solve(root.right);
    }
}
