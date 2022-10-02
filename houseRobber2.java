public class houseRobber2 {
    public int solution(int[] nums){
        if(nums.length==1) return nums[0];

        return Math.max(helper(nums, 0, nums.length-1), helper(nums, 1, nums.length));
    }

    public int helper(int[] nums, int start, int end){
        int rob1=0, rob2=0;

        for(int i=start;i<end;i++){
            int cur_rob = Math.max(nums[i]+rob1, rob2);
            rob1=rob2;
            rob2=cur_rob;
        }
        return rob2;
    }
}
