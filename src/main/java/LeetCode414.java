import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by wxg on 2020/8/10.
 */
public class LeetCode414 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 5, 3, 5};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        List<Integer> list = new ArrayList<Integer>(set);
        if (list.size() > 3) {
            return list.get(list.size() - 3);
        } else if (list.size() == 2) {
            return list.get(1);
        }

        return list.get(0);
    }
}
