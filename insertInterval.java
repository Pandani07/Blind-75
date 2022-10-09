import java.util.*;
public class insertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;

        for(int i=0;i<n;i++){
            int[] current = intervals[i];

            if(newInterval==null || current[1]<newInterval[0]){
                res.add(current);
            }else if(newInterval[1]<current[0]){
                res.add(newInterval);
                res.add(current);
                newInterval = null;
            }else{
                newInterval[0] = Math.min(newInterval[0], current[0]);
                newInterval[1] = Math.max(newInterval[1], current[1]);
            }
        }
        if(newInterval!=null){
            res.add(newInterval);
        }
        return res.toArray(new int[0][0]);
    }
}
