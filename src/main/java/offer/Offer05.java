package offer;

/**
 * Created by wxg on 2020/10/12.
 */

/**
 * ��ʵ��һ�����������ַ��� s �е�ÿ���ո��滻��"%20"��
 *
 * ?
 *
 * ʾ�� 1��
 *
 * ���룺s = "We are happy."
 * �����"We%20are%20happy."
 */
public class Offer05 {

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}
