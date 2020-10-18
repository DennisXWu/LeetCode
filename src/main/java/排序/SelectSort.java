package 排序;

import java.util.Arrays;

/**
 * Created by wxg on 2020/10/18.
 */
//选择排序
public class SelectSort {

    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 4, 3, 2, 7, 9};
        select_Sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void select_Sort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[i]) {
                    int temp = arrays[j];
                    arrays[j] = arrays[i];
                    arrays[i] = temp;
                }
            }
        }
    }
}
