package LeetCode.数据结构.哈希表;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxg on 2021/1/26.
 */
public class LeetCode202 {

    public static void main(String[] args) {
        LeetCode202 leetCode202 = new LeetCode202();
        leetCode202.isHappy(19);
    }

    public int add(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1) {
            if (!set.add(n)) {
                return false;
            }
            n = add(n);
        }
        return true;
    }
}
