
class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int[] countA = new int[7];
        int[] countB  = new int[7];
        int[] rec = new int[7];
        
        for (int i = 0;  i < A.length; i++){
            countA[A[i]] ++;
            countB[B[i]] ++;
            if(A[i] == B[i]){
                rec[A[i]]++;
            }
        }
        
        for(int j = 1; j < 7; j++){
            
            if(countA[j] + countB[j] - rec[j] == A.length){
                
                return A.length - (Math.max(countA[j],countB[j]));
            }
        }
        
        return -1;
        
    }
}