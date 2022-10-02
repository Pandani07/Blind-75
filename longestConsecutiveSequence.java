import java.util.HashSet;

public class longestConsecutiveSequence {
    public int solution(int[] nums){
        int length=0, longest=0;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<nums.length;i++)
            h.add(nums[i]);
        for(int n: nums){
            if(!h.contains(n-1)){
                length=0;
                while(h.contains(n+1)){
                    length++;
                }
                longest=Math.max(length, longest);
            }
        }
        return longest;
    }
}
