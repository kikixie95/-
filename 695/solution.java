class Solution {
    int count;
    public int maxAreaOfIsland(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    count = 0;
                    helper(grid, i , j);
                    res = Math.max(res,count);
                }
            }
        }
        return res;
    }
    public void helper(int[][] grid, int row, int col){
        if(row < 0 || row > grid.length-1 || col < 0 || col > grid[0].length-1||grid[row][col] == 0){
            return;
        }
        count++;
        grid[row][col] = 0;
        helper(grid, row+1,col);
        helper(grid, row-1,col);
        helper(grid, row,col-1);
        helper(grid, row,col+1);
    }
}