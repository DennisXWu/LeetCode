package LeetCode.字符串.others;

/**
 * Created by wxg on 2020/8/24.
 */

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode14￥ {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight" };
        String s = longestCommonPrefix2(strs);
        System.out.println(s);
    }

    //横向比较
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String longestStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            longestStr = getLongestStr(longestStr, strs[i]);
            if (longestStr.length() == 0) {
                break;
            }
        }
        return longestStr;
    }

    private static String getLongestStr(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < length && str1.charAt(index) == str2.charAt(index)) {
            index++;
        }
        return str1.substring(0, index);
    }

    //横向比较
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int h = strs[0].length();
        int v = strs.length;
        for (int i = 0; i < h; i++) {
            char c1 = strs[0].charAt(i);
            for (int j = 0; j < v; j++) {
                if (i == strs[j].length() || c1 != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
