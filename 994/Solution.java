class Solution {
    public int orangesRotting(int[][] grid) {
        // store rotting oranges
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        //  number of value1 oranges
        int one = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    queue.addLast(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    one ++;
                }
            }
        }
        
        if(one == 0) return 0;
        int count = 0;
        int [][] direction = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            count++;
            int size = queue.size();
            
            for(int i = 0; i < size; i++){
                int[] position = queue.removeFirst();
                for(int[] dir : direction){
                    int x = position[0] + dir[0];
                    int y = position[1] + dir[1];
                    
                    if(x < 0 || y < 0 || x > grid.length-1 || y > grid[0].length -1 || grid[x][y] == 2 || grid[x][y] == 0) continue;

                    grid[x][y] = 2;
                    queue.addLast(new int[]{x,y});
                    one--;
                }
            }
        }
        if(one != 0) return -1;
        else return count-1;
        
    }
    
  
}