package 剑指Offer;

/**
 * Created by wxg on 2020/12/1.
 */

/**
 * ʵ�ֺ���double Power(double base, int exponent)����base��exponent�η�������ʹ�ÿ⺯����ͬʱ����Ҫ���Ǵ������⡣
 *
 * ?
 *
 * ʾ�� 1:
 *
 * ����: 2.00000, 10
 * ���: 1024.00000
 */
public class Offer16 {

    public static void main(String[] args) {
        Offer16 offer16 = new Offer16();
        double result = offer16.myPow2(2.00000, 9);
        System.out.println(result);
    }


    //
    public double myPow(double x, int n) {
        double result = 1.0;
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else if (n < 0) {
            for (int i = 0; i < -1 * n; i++) {
                result *= x;
            }
            result = 1 / result;
        }
        return result;
    }


    //������
    public double myPow2(double x, int n) {
        if (x == 0) return 0;
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
