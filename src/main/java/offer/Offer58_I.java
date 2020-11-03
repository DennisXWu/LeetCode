package offer;

/**
 * Created by wxg on 2020/10/26.
 */


import java.util.Stack;

/**
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 *
 * 示例 1：
 *
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 */
public class Offer58_I {
    public static void main(String[] args) {
        System.out.println(reverseWords1("the sky is blue"));
    }

    //
    public static String reverseWords(String s) {
        String[] split = s.trim().split(" ");
        Stack<String> stack = new Stack<>();
        StringBuffer buffer = new StringBuffer();
        for (String str : split) {
            if (str != null && !str.isEmpty()) {
                stack.push(str);
            }
        }
        while (stack.size() > 0) {
            buffer.append(stack.pop() + " ");
        }
        return buffer.toString().trim();
    }

    //双指针法
    public static String reverseWords1(String s) {
        int right;
        int left = s.length() - 1;
        StringBuffer buffer = new StringBuffer();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                right = i;
                for (int j = i; j >= 0; j--) {
                    if (s.charAt(j) == ' ') {
                        break;
                    }
                    left = j;
                }
                buffer.append(s.substring(left, right + 1) + " ");
                i = left;
            }
        }
        return buffer.toString().trim();
    }

}
