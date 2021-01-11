package LeetCode.字符串;

/**
 * Created by wxg on 2020/8/17.
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LeetCode3 {

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }


    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            //如果有重复的左指针继续往前，直到set中没有重复数据
            if (i != 0) {
                set.remove(chars[i - 1]);
            }

            //如果没有重复的则右指针继续往前
            while (right < chars.length && !set.contains(chars[right])) {
                set.add(chars[right]);
                right++;
            }

            //计算非重复子串长度
            max = Math.max(max, set.size());
        }
        return max;
    }
}
