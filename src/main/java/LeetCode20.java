import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by wxg on 2020/7/29.
 */
public class LeetCode20 {

    public static void main(String[] args) {
        System.out.println(isValid("{"));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack stack = new Stack();
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        for (char c : chars) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                if (!(map.get(c) == stack.pop())) {
                    return false;
                }
            }
        }

        if (stack.size() == 0)
            return true;
        return false;
    }
}
