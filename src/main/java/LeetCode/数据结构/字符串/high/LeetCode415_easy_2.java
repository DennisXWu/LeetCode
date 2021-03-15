package LeetCode.数据结构.字符串.high;

/**
 * Created by wxg on 2021/2/3.
 */
public class LeetCode415_easy_2 {
    public static void main(String[] args) {
        String s = new LeetCode415_easy_2().addStrings("1", "9");
        System.out.println(s);
    }

    public String addStrings(String nums1, String nums2) {

        int length1 = nums1.length() - 1;
        int length2 = nums2.length() - 1;

        StringBuilder stringBuilder = new StringBuilder();
        int carray = 0;
        int sum = 0;
        while (length1 >= 0 || length2 >= 0) {
            sum = carray;
            if (length1 >= 0) sum += nums1.charAt(length1--) - '0';
            if (length2 >= 0) sum += nums2.charAt(length2--) - '0';

            stringBuilder.insert(0, String.valueOf(sum % 10));
            carray = sum / 10;
        }

        if (carray != 0) {
            stringBuilder.insert(0, String.valueOf(carray));
        }
        return stringBuilder.toString();
    }
}
