package LeetCode.数据结构.字符串.important;

/**
 * Created by wxg on 2021/2/3.
 */
public class LeetCode415 {
    public String addStrings(String nums1, String nums2) {
        int length1 = nums1.length() - 1;
        int length2 = nums2.length() - 1;
        StringBuilder builder = new StringBuilder();
        int carray = 0;
        while (length1 >= 0 || length2 >= 0) {
            int sum = carray;
            if (length1 >= 0) sum += nums1.charAt(length1--) - '0';
            if (length2 >= 0) sum += nums2.charAt(length2--) - '0';
            builder.insert(0, (char) (sum % 10 + '0'));
            carray = sum / 10;
        }
        if (carray > 0) {
            builder.insert(0, (char) (carray + '0'));
        }
        return builder.toString();
    }
}
