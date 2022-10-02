import java.util.Arrays;

public class LIS {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for(int i=nums.length;i>=0;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    dp[i] = Math.max(dp[i], 1+dp[j]);
                }
            }
        }
        Arrays.sort(dp);
        return dp[nums.length-1];
    } 
}
