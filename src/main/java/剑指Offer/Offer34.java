package 剑指Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by wxg on 2020/12/13.
 */
public class Offer34 {

    List<List<Integer>> array = new ArrayList<>();
    LinkedList<Integer> list = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        solve(root, sum);
        return array;
    }

    public void solve(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            array.add(new LinkedList<>(list));
        }
        pathSum(root.left, sum - root.val);
        pathSum(root.right, sum - root.val);

        list.removeLast();
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
