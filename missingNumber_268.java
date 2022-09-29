public class missingNumber_268{
    public int solution(int[] nums){
        int res = nums.length;

        for(int i=0;i<nums.length;i++){
            res+=i-nums[i];
        }
        return res;
    }
}