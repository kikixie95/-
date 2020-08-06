class Solution {
    boolean[][]visited;
    int[][]grid;
    public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
        this.grid =grid;
        if(grid == null || grid.length==0){
            
             return grid;
        }
           
        visited = new boolean[grid.length][grid[0].length];
        dfs(r0,c0,r0,c0,color);
        return grid;
        
    }
    public int dfs(int row, int col, int r0, int c0, int color){
         if(row <0 || row >=grid.length || col < 0|| col >=grid[0].length ){
            return 0;
        }
        if(visited[row][col]) return 1;
        if(grid[row][col] != grid[r0][c0]){
            return 0;
        }
      
    
        
       
        visited[row][col] = true;
        int count = 0;
        count = dfs(row+1,col,r0,c0,color) + dfs(row-1,col,r0,c0,color) + dfs(row,col+1,r0,c0,color) + dfs(row,col-1,r0,c0,color);
        if(count <4)
            grid[row][col] = color;
         return 1;
        }
       
    }
