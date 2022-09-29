import java.util.*;;
public class kFrequent {
    public int[] solution(int[] nums, int k){
        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i:nums){
            if(!hmap.containsKey(i)){
                hmap.put(i, 0);
            }else{
                hmap.put(i, hmap.get(i));
            }
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b)->hmap.get(a)-hmap.get(b));

        for(int key: hmap.keySet()){
            heap.add(key);
            if(heap.size()>k){
                heap.remove();
            }
        }

        int[] top = new int[k];

        for(int i=k-1;i>=0;i--){
            top[i]=heap.remove();
        }
        return top;
    }
}
