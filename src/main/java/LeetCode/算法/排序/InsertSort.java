package LeetCode.算法.排序;

import java.util.Arrays;

/**
 * Created by wxg on 2021/2/21.
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 4, 3, 2, 7, 9};
        new InsertSort().insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public void insertSort(int[] arrays) {
        for (int i = 1; i < arrays.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arrays[j] > arrays[i]) {
                    int tmp = arrays[j];
                    arrays[j] = arrays[i];
                    arrays[i] = tmp;
                }
            }
        }
    }
}
