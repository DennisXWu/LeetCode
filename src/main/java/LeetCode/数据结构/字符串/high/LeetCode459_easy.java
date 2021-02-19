package LeetCode.数据结构.字符串.high;

import java.util.HashSet;

/**
 * Created by wxg on 2021/2/5.
 */
public class LeetCode459_easy {

    public boolean repeatedSubstringPattern(String s) {
        int middle = s.length() / 2;
        for (int i = middle; i >= 1; i--) {
            if (s.length() % i == 0) {
                int size = 0;
                HashSet<String> set = new HashSet<>();
                while (size < s.length()) {
                    StringBuilder builder = new StringBuilder();
                    for (int j = size; j < size + i; j++) {
                        builder.append(s.charAt(j));
                    }
                    size = size + i;
                    set.add(builder.toString());
                }
                if (set.size() == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
