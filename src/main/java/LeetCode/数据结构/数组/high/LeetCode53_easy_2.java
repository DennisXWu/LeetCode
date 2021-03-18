package LeetCode.数据结构.数组.high;

/**
 * Created by wxg on 2021/3/18.
 */
public class LeetCode53_easy_2 {
    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int max=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(dp[i-1]<0){
                dp[i]=nums[i];
            }else{
                dp[i]=dp[i-1]+nums[i];
            }
        }
        for(int i=0;i<dp.length;i++){
            if(dp[i]>max){
                max=dp[i];
            }
        }
        return max;
    }
}
