package blind75;
import java.util.*;
public class twoSum_1 {
    public int[] solution(int[] nums, int target){
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(hash.containsKey(nums[i])){
                return new int[] {hash.get(diff), i};
            }else{
                hash.put(nums[i], i);
            }
        }
        return nums;
    }
}
