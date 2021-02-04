package LeetCode.数据结构.字符串.important;

/**
 * Created by wxg on 2021/2/4.
 */

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 *  
 *
 * 示例：
 *
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 */
public class LeetCode557 {

    //方法1
    public String reverseWords(String s) {
        String[] arrays = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String str : arrays) {
            builder.append(reverse(str));
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    public String reverse(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
}
