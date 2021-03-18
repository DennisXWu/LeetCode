package 剑指Offer.数组;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wxg on 2021/3/18.
 */
public class Offer03_easy {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return nums[i];
            }
        }
        return 0;
    }
}
