class Solution {
    boolean[][] visited;
     private int[][] direction = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
    int row;
    int col;
    char[][] board;
    public boolean exist(char[][] board, String word) {
        this.board = board;
        row = board.length; col = board[0].length;
        visited = new boolean[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
            if(dfs( word, i, j, 0)){
                return true;
            }    
            }
        }
        return false;
        
    }
    public boolean dfs(String word, int i, int j, int start){
      if (start == word.length() - 1) {
            return board[i][j] == word.charAt(start);
        }

        if (board[i][j] == word.charAt(start)) {
            visited[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int newX = i + direction[k][0];
                int newY = j + direction[k][1];
                if (inArea(newX, newY) && !visited[newX][newY]) {
                    if (dfs(word,newX, newY, start + 1)) {
                        return true;
                    }
                }
            }
            visited[i][j] = false;
        }
        return false;
    }



    public boolean inArea( int i, int j){
        return i>=0 && i < row && j >= 0 && j < col;
    }
}