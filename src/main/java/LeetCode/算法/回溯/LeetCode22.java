package LeetCode.算法.回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2020/12/14.
 */
public class LeetCode22 {
    List<String> list = new ArrayList<>();
    int n;

    public static void main(String[] args) {
        System.out.println(new LeetCode22().generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        this.n = n;
        solve("", 0, 0);
        return list;
    }

    private void solve(String s, int left, int right) {
        if (left == n && right == n) {
            list.add(s);
            return;
        }

        if (left > n || left < right) {
            return;
        }

        solve(s + "(", left + 1, right);
        solve(s + ")", left, right + 1);
    }
}
