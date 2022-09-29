public class longestIncContSubsequence {
    public int solution(int[] nums){
        int anchor=0, res=0;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i-1]>=nums[i])
                anchor=i;
            res = Math.max(res, i-anchor+1);
        }
        return res;
    }
}
