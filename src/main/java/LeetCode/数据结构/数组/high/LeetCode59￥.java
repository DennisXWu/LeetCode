package LeetCode.数据结构.数组.high;

/**
 * Created by wxg on 2021/1/19.
 */

/**
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * 示例:
 *
 * 输入: 3
 * 输出:
 * [
 * [ 1, 2, 3 ],
 * [ 8, 9, 4 ],
 * [ 7, 6, 5 ]
 * ]
 */
public class LeetCode59￥ {

    public static void main(String[] args) {
        LeetCode59￥ leetCode59￥ = new LeetCode59￥();
        leetCode59￥.generateMatrix(3);
    }

    public int[][] generateMatrix(int n) {
        int[][] martix = new int[n][n];
        int rightBorder = n - 1;
        int downBorder = n - 1;
        int leftBorder = 0;
        int upBorder = 0;
        int count = 1;

        while (count <= n * n) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                martix[upBorder][i] = count++;
            }
            upBorder++;

            for (int i = upBorder; i <= downBorder; i++) {
                martix[i][rightBorder] = count++;
            }

            rightBorder--;

            for (int i = rightBorder; i >= leftBorder; i--) {
                martix[downBorder][i] = count++;
            }

            downBorder--;

            for (int i = downBorder; i >= upBorder; i--) {
                martix[i][leftBorder] = count++;
            }
            leftBorder++;
        }
        return martix;
    }
}
