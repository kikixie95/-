class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length <1) return false;
        int row = matrix.length-1, col = matrix[0].length-1, i = row, j = 0;
        
        while(i >= 0 && j <=col){
            if(matrix[i][j] < target){
                j++;
            }
            else if(matrix[i][j] > target){
                i--;
            }else{
                return true;
            }
        }
        return false;
    }
}