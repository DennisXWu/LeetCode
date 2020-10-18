package offer;

/**
 * Created by wxg on 2020/10/18.
 */

import java.util.Arrays;

/**
 * ������������ arr ���ҳ�������С�� k ���������磬����4��5��1��6��2��7��3��8��8�����֣�����С��4��������1��2��3��4��
 *
 * ?
 *
 * ʾ�� 1��
 *
 * ���룺arr = [3,2,1], k = 2
 * �����[1,2] ���� [2,1]
 */
public class Offer40 {

    public static void main(String[] args) {
        int[] arrays = new int[]{0, 0, 1, 2, 4, 2, 2, 3, 1, 4
        };
        System.out.println(Arrays.toString(getLeastNumbers(arrays, 8)));
    }

    public static int[] getLeastNumbers(int[] array, int k) {
        int[] result = new int[k];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
