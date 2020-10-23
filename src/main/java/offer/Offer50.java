package offer;

/**
 * Created by wxg on 2020/10/23.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 *
 * 示例:
 *
 * s = "abaccdeff"
 * 返回 "b"
 *
 * s = ""
 * 返回 " "
 */
public class Offer50 {

    public static void main(String[] args) {
        String str = "abaccdeff";
        System.out.println(firstUniqChar1(str));
    }

    public static char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int value = map.containsKey(s.charAt(i)) ? map.get(s.charAt(i)) + 1 : 1;
            map.put(s.charAt(i), value);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }

    public static char firstUniqChar1(String s) {
        int[] count = new int[256];
        char[] chars = s.toCharArray();
        for (char c : chars)
            count[c]++;
        for (char c : chars) {
            if (count[c] == 1)
                return c;
        }
        return ' ';
    }
}
