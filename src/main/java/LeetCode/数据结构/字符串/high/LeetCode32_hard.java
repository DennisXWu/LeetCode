package LeetCode.数据结构.字符串.high;

import java.util.Stack;

/**
 * Created by wxg on 2020/9/9.
 */
public class LeetCode32_hard {

    public static void main(String[] args) {
        System.out.println(longestValidParentheses1("()(()()("));
    }


    //LeetCode.栈
    public static int longestValidParentheses1(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }
}
