class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length<1) return new int[0];
        int col =  matrix[0].length;
        int row = matrix.length;
        int i = 0;
        int j = 0;
        int[] res = new int[col*row];

       
     for(int idx = 0; idx < res.length; idx++){
        res[idx] = matrix[i][j];
            
        if((i+j)%2 == 0){
            
              if(j == col-1){
                  i++;
              }else if(i == 0 ){
                  j++;
              }else{
                i = i-1;
                j = j+1;
              }
        
            }
         else{
             
             if(i == row-1){
                    j++;
                }
                else if(j == 0){
                    i = i+1;
                }else{
                i = i+1;
                j = j-1;
                }
               
            }
            }

        return res;
    }
}