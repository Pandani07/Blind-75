import java.util.*;
import java.util.PriorityQueue;

public class meeting2 {
    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public int minMeetingRooms(Interval[] intervals) {
        if(intervals==null || intervals.length==0) return 0;

        Arrays.sort(intervals, (a,b)->a.start-b.start);
        PriorityQueue<Interval> heap = new PriorityQueue<>((a,b)->a.end-b.end);
        heap.add(intervals[0]);

        for(int i=0;i<intervals.length;i++){
            Interval current = intervals[i];
            Interval earliest = heap.remove();

            if(current.start>=earliest.end){
                earliest.end = current.end;
            }else{
                heap.add(current);
            }

            heap.add(earliest);
        }
        return heap.size();

    }

    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals.size() == 0) {
            return 0;
        }

        int len = intervals.size();
        int[] startTime = new int[len];
        int[] endTime = new int[len];

        for (int i = 0; i < len; i++) {
            startTime[i] = intervals.get(i).start;
            endTime[i] = intervals.get(i).end;
        }

        Arrays.sort(startTime);
        Arrays.sort(endTime);

        int res = 0;
        int count = 0;
        int s = 0;
        int e = 0;

        while (s < len) {
            if (startTime[s] < endTime[e]) {
                s++;
                count++;
            } else {
                e++;
                count--;
            }
            res = Math.max(res, count);
        }

        return res;
    }
}
