package blind75;
public class containsMostWater {
    public int solution(int[] heights){
        int res=0;

        int a_pointer = 0, b_pointer = heights.length-1;

        while(a_pointer<b_pointer){
            if(heights[a_pointer]<heights[b_pointer]){
                res = Math.max(res, heights[a_pointer]*heights[b_pointer]-heights[a_pointer]);
                a_pointer+=1;
            }
            else{
                res= Math.max(res, heights[b_pointer]*heights[b_pointer]-heights[a_pointer]);
                b_pointer-=1;
            }
        }

        return res;
    }
}
