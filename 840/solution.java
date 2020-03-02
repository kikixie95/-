class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int ans = 0;
        for(int i = 1; i < grid.length-1;i++){
            int j = 1;
            while(j <grid[0].length-1){
                //find 5
                if(grid[i][j] == 5){
                    if(grid[i-1][j-1] %2==0 
                       && grid[i-1][j+1] %2==0
                       && grid[i+1][j-1] %2==0 
                       &&grid[i+1][j+1] %2==0 
                       
                       && grid[i-1][j-1] + grid[i][j-1] + grid[i+1][j-1] == 15 
                       && grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1] == 15 
                       
                       && grid[i][j-1]+grid[i][j+1] == 10 
                       && grid[i-1][j]+grid[i+1][j] == 10 
                       
                       && grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1] == 15
                      
                       && grid[i-1][j+1] + grid[i][j+1]+grid[i+1][j+1]==15 ) 
                        ans++;
                }
                j++;
            }
        }
        return ans;
    }
}