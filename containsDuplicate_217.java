import java.util.*;

public class containsDuplicate_217{
    public boolean solution(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }

        if(hs.size()==nums.length)
            return false;
        return true;
    }
}