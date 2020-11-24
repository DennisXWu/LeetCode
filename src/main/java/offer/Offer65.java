package offer;

/**
 * Created by wxg on 2020/11/4.
 */

/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 *
 * 示例:
 *
 * 输入: a = 1, b = 1
 * 输出: 2
 */
public class Offer65 {

    public static void main(String[] args) {
        System.out.println(add(3, 4));
    }

    public static int add(int a, int b) {
        while (b != 0) {
            int n = (a & b) << 1; //进位
            a ^= b; // 非进位和
            b = n;
        }
        return a;
    }

}
