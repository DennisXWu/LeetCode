package LeetCode.数据结构.哈希表;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wxg on 2021/1/25.
 */
public class LeetCode242 {

    public static void main(String[] args) {
        LeetCode242 leetCode242 = new LeetCode242();
        leetCode242.isAnagram("anagram", "nagaram");
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), (map.get(s.charAt(i)) == null ? 0 : map.get(s.charAt(i))) + 1);
            map2.put(t.charAt(i), (map2.get(t.charAt(i)) == null ? 0 : map2.get(t.charAt(i))) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (!map.get(s.charAt(i)).equals(map2.get(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
