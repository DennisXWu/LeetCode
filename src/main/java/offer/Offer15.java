package offer;

/**
 * Created by wxg on 2020/10/15.
 */

/**
 * ��ʵ��һ������������һ��������������������Ʊ�ʾ�� 1 �ĸ��������磬�� 9?��ʾ�ɶ������� 1001���� 2 λ�� 1����ˣ�������� 9����ú������ 2��
 */
public class Offer15 {

    public static void main(String[] args) {
        System.out.println(hammingWeight(9));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
