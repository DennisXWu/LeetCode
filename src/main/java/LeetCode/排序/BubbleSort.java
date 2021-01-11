package LeetCode.排序;

import java.util.Arrays;

/**
 * Created by wxg on 2020/10/18.
 */

//冒泡排序
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 4, 3, 2, 7, 9};
        bubble_sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void bubble_sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
