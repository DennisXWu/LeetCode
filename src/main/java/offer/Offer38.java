package offer;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxg on 2021/1/4.
 */
public class Offer38 {

    public static void main(String[] args) {
        Offer38 offer38 = new Offer38();
        String[] abcs = offer38.permutation("abcd");
        for (String str : abcs) {
            System.out.print(str + " ");
        }
    }

    public void backtrack(Set<String> res, StringBuilder temp, String s, boolean[] visited) {
        if (temp.length() == s.length()) {
            res.add(temp.toString());
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            if (visited[i]) continue;
            visited[i] = true;
            temp.append(s.charAt(i));
            backtrack(res, temp, s, visited);
            temp.deleteCharAt(temp.length() - 1);
            visited[i] = false;
        }
    }

    public String[] permutation(String s) {
        Set<String> res = new HashSet<>();
        backtrack(res, new StringBuilder(), s, new boolean[s.length()]);
        return res.toArray(new String[0]);
    }
}
