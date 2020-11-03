package offer;

/**
 * Created by wxg on 2020/10/27.
 */

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 */
public class Offer58_II {
    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
    }

    public static String reverseLeftWords(String s, int n) {
        StringBuffer buffer = new StringBuffer();
        for (int i = n; i < s.length(); i++) {
            buffer.append(s.charAt(i));
        }
        for (int j = 0; j < n; j++) {
            buffer.append(s.charAt(j));
        }
        return buffer.toString();
    }
}
