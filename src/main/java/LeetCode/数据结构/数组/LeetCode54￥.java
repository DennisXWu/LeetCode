package LeetCode.数据结构.数组;

/**
 * Created by wxg on 2021/1/19.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 *
 * 示例 1:
 *
 * 输入:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 */
public class LeetCode54￥ {

    public static void main(String[] args) {
        LeetCode54￥ leetCode54￥ = new LeetCode54￥();
        int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        leetCode54￥.spiralOrder(array);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int topBorder = 0;
        int rightBorder = col - 1;
        int downBorder = row - 1;
        int leftBorder = 0;

        while (list.size() < col * row) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                list.add(matrix[topBorder][i]);
            }

            topBorder++;
            if (list.size() == col * row) {
                break;
            }

            for (int i = topBorder; i <= downBorder; i++) {
                list.add(matrix[i][rightBorder]);
            }
            rightBorder--;

            if (list.size() == col * row) {
                break;
            }

            for (int i = rightBorder; i >= leftBorder; i--) {
                list.add(matrix[downBorder][i]);
            }
            downBorder--;

            if (list.size() == col * row) {
                break;
            }

            for (int i = downBorder; i >= topBorder; i--) {
                list.add(matrix[i][leftBorder]);
            }
            leftBorder++;
        }
        return list;
    }
}
