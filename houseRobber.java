public class houseRobber {
    public int solution(int[] nums){
        if(nums.length==0) return 0;
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i+1] = Math.max(dp[i], dp[i-1]+nums[i]);
        }

        return dp[nums.length];
    }

    public int solution2(int[] nums){
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];

        int rob1=0, rob2=0;

        for(int i=0;i<nums.length;i++){
            int cur_rob = Math.max(nums[i]+rob1, rob2);
            rob1=rob2;
            rob2=cur_rob;
        }
        return rob2;
    }
}
