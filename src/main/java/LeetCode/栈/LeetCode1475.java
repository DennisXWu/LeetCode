package LeetCode.栈;

/**
 * Created by wxg on 2020/11/24.
 */

import java.util.Arrays;
import java.util.Stack;

/**
 * 输入：prices = [8,4,6,2,3]
 * 输出：[4,2,4,2,3]
 * 解释：
 * 商品 0 的价格为 price[0]=8 ，你将得到 prices[1]=4 的折扣，所以最终价格为 8 - 4 = 4 。
 * 商品 1 的价格为 price[1]=4 ，你将得到 prices[3]=2 的折扣，所以最终价格为 4 - 2 = 2 。
 * 商品 2 的价格为 price[2]=6 ，你将得到 prices[3]=2 的折扣，所以最终价格为 6 - 2 = 4 。
 * 商品 3 和 4 都没有折扣。
 */
public class LeetCode1475 {

    public static void main(String[] args) {
        int[] array = new int[]{10, 1, 1, 6};
        int[] ints = finalPrices(array);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                prices[stack.peek()] -= prices[i];
                stack.pop();
            }
            stack.push(i);
        }
        return prices;
    }
}
