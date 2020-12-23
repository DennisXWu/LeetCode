package offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by wxg on 2020/12/22.
 */
public class Offer45 {

    public String minNumber(int[] nums) {
        if (nums == null || nums.length == 0) return null;

        String[] arrays = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arrays[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arrays, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });

        StringBuffer buffer = new StringBuffer();
        for (String str : arrays) {
            buffer.append(str);
        }
        return buffer.toString();
    }
}
