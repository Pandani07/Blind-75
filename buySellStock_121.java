
public class buySellStock_121 {
    public int solution(int[] prices){
        int l=0,r=1;
        int maxp = 0;

        while(r<prices.length){
            if(prices[l]<prices[r]){
                int profit = prices[r]-prices[l];
                maxp = Math.max(maxp, profit);
            }else{
                l=r;
            }
            r+=1;
        }
        return maxp;
    }
}
