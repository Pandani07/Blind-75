public class jumpGame {
    public boolean solution(int[] nums){
        int lastgoodpos=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=lastgoodpos){
                lastgoodpos=i;
            }
        }
        return lastgoodpos==0;
    }
}
