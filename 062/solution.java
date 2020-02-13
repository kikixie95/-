class Solution {
    public int uniquePaths(int m, int n) {
        int [][] res = new int[m][n];
        for(int[] r : res)
       Arrays.fill(r,1);
        
   
        for(int m1 = 1; m1 < m; m1++){
            for(int n1 = 1; n1 < n; n1 ++){
                 res[m1][n1] = res[m1-1][n1] + res[m1][n1-1];
            }
        }
        
           

        return res[m-1][n-1];
    
         }
}