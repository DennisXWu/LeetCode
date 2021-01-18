package 剑指Offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wxg on 2020/12/29.
 */
public class Offer29 {
    public static void main(String[] args) {
        Offer29 offer29 = new Offer29();
        int[][] martx = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(offer29.spiralOrder(martx));
    }

    public int[] spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[]{};
        }
        int flag = 1; //1:right 2:down 3:left 4:up
        List<Integer> list = new ArrayList<>();
        boolean[][] vist = new boolean[matrix.length][matrix[0].length];
        int x = 0;
        int y = 0;

        while (list.size() < matrix.length * matrix[0].length) {
            if (x >= matrix.length || y >= matrix[0].length || x < 0 || y < 0 || vist[x][y]) {
                if (flag == 1) {
                    flag = 2;
                    y--;
                    x++;
                } else if (flag == 2) {
                    flag = 3;
                    x--;
                    y--;
                } else if (flag == 3) {
                    flag = 4;
                    y++;
                    x--;
                } else {
                    flag = 1;
                    x++;
                    y++;
                }
            } else {
                list.add(matrix[x][y]);
                vist[x][y] = true;
                if (flag == 1) {
                    y++;
                } else if (flag == 2) {
                    x++;
                } else if (flag == 3) {
                    y--;
                } else {
                    x--;
                }
            }
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
