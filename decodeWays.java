public class decodeWays {
    public int solution(String s){
        int[]dp = new int[s.length()];
        dp[0] = 0;
        dp[1] = s.charAt(0)=='0'?0:1;
        for(int i=2;i<=s.length();i++){
            int one_digit = Integer.valueOf(s.substring(i-1, i));
            int two_digit = Integer.valueOf(s.substring(i-2, i));

            if(one_digit>=1){
                dp[i]+=dp[i-1];
            }
            if(two_digit>=10){
                dp[i]+=dp[i-2];
            }
        }

        return dp[s.length()];
    }
}
