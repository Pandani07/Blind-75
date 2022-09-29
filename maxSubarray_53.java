
public class maxSubarray_53 {
    public int solution(int[] nums){
        int max = nums[0];
        int cur=max;
        for(int i=0;i<nums.length;i++){
            cur = Math.max(nums[i]+cur, nums[i]);
            max = Math.max(cur, max);
        }

        return max;
    }
}
