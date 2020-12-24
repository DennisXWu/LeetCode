package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxg on 2020/12/23.
 */
public class Offer48 {

    public static void main(String[] args) {
        Offer48 offer48 = new Offer48();
        System.out.println(offer48.lengthOfLongestSubstring("abba"));
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int max = 0;
        int left = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                left = Math.max(left, map.get(s.charAt(i)));
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left);
        }
        return max;
    }
}
