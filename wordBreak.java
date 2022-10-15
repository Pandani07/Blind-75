import java.util.List;

public class wordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[s.length()] = true;

        for(int i=s.length();i>=0;i--){
            for(String word: wordDict){
                if(i+word.length()<=s.length() && s.substring(, i+word.length()).startsWith(word)){
                    dp[i] = dp[i+word.length()];
                }
                if(dp[i]) break;
            }
        }
        return dp[0];
    }
}
