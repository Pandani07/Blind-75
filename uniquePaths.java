public class uniquePaths {
    public int solution(int m, int n){
        int[][] grid = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0) grid[i][j]=1;
                if(i!=0 && j!=0){
                    int up = grid[i-1][j];
                    int left = grid[i][j-1];
                    grid[i][j] = up+left;
                }
            }
        }

        return grid[m-1][n-1];
    }
}
