import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxg on 2020/8/4.
 */
public class LeetCode3 {

    public static void main(String[] args) {
        String str = "abba";

        System.out.println("str : " + str);
        System.out.println(lengthOfLongestSubString(str));

    }


    public static int lengthOfLongestSubString(String str) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int start = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                System.out.println("add before c:" + str.charAt(i));
                map.put(str.charAt(i), i);
                System.out.println("add after map" + map.toString());
            } else {
                start = Math.max(start, map.get(str.charAt(i)) + 1);
                System.out.println("remove before c:" + str.charAt(i) + " start=" + start);
                map.put(str.charAt(i), i);
                System.out.println("remove after map=" + map.toString());
            }
            max = Math.max(i - start + 1, max);
            System.out.println("max:" + max);
        }
        return max;
    }
}
