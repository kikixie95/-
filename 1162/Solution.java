class Solution {
    public int maxDistance(int[][] grid) {
     int[][] direction = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    
      Deque<int[]>queue = new ArrayDeque();
        int row = grid.length, col = grid[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    queue.addLast(new int[]{i,j});
                }
            }
        }
        boolean hasOcean = false;
        int[] point = null;
        while(!queue.isEmpty()){
            point = queue.removeFirst();
            int x = point[0], y = point[1];
            
            for(int i = 0; i < 4; i++){
                int newX = x+direction[i][0];
                int newY = y+direction[i][1];
                if(newX < 0 || newX >= row || newY < 0 || newY >= col || grid[newX][newY] != 0){
                    continue;
                }
                grid[newX][newY] = grid[x][y]+1;
                hasOcean = true;
                queue.addLast(new int[]{newX, newY});
            }
        }
           if(point == null || !hasOcean){
                return -1;
            }
        return grid[point[0]][point[1]]-1;
            
    }
}