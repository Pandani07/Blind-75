import java.util.Arrays;

public class coinChange{
    public int solution(int[] coins, int amount){
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);

        for(int i=0;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(coins[j]<i){
                    dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
                }else{
                    break;
                }
            }
        }

        return dp[amount]>amount? -1: dp[amount];

    }
}