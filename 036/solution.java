class Solution {
    public boolean isValidSudoku(char[][] board) {
     //9 * 9 boolean array to check each col;
        boolean[][] col = new  boolean[9][9];
      
    // 9 * 9 boolean array to check each row;
         boolean[][] row = new  boolean[9][9];
    // 9 * 9 boolean array to check each box;
         boolean[][] box = new  boolean[9][9];
        
        for(int i = 0; i < board.length; i++){//row
            for(int j = 0; j < board[0].length; j++){//column
                if(board[i][j] != '.'){
                    int tmp = board[i][j]-'1';
                    if(row[i][tmp]||col[j][tmp]|| box[(i/3)*3 + (j/3)][tmp]){
                        return false;
                    } 
                    else{
                        row[i][tmp] = true;
                        col[j][tmp] = true;
                        box[(i/3)*3 + (j/3)][tmp] = true;
                    }
                    
                }
            }
        }
        return true;
        
    }
}