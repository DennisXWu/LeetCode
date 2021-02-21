package LeetCode.算法.排序;

import java.util.Arrays;

/**
 * Created by wxg on 2021/2/21.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 4, 3, 2, 7, 9};
        new QuickSort().quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public void quickSort(int[] arrays, int left, int right) {
        if (left >= right) return;
        int i = left;
        int j = right;
        int base = arrays[i];
        while (i < j) {
            while (i < j && arrays[j] >= base) {
                j--;
            }
            while (i < j && arrays[i] <= base) {
                i++;
            }
            if (i < j) {
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;
            }
        }
        arrays[left] = arrays[i];
        arrays[i] = base;
        quickSort(arrays, left, i - 1);
        quickSort(arrays, i + 1, right);
    }
}
