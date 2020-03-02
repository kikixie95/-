// O(n) T and S complexity
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] odd = new int[A.length/2];
        int[] even = new int[A.length/2];
        int odd_idx = 0;
        int even_idx = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 != 0){
                odd[odd_idx++] = A[i];
            }else{
                even[even_idx++] = A[i];
            }
        }
    
        for(int i = 0; i < A.length; i++){
            if(i % 2 == 0){
                A[i] = even[--even_idx];
            }else{
                 A[i] = odd[--odd_idx];
            }
        }
        return A;
    }
}


//
