import java.util.*;
public class meetingRooms {
    public boolean solution(int[][] intervals){
        int[] starts = new int[intervals.length]; 
        int[] ends = new int[intervals.length]; 
        for(int i = 0; i <intervals.length; i++){
           starts[i] = intervals[i][0]; 
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts); 
        Arrays.sort(ends); 
        for(int i = 0; i< starts.length-1; i++){
            if(starts[i+1] < ends[i]){
                return false; 
            }
        }
        return true; 
    }
}
