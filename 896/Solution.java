class Solution {
    public boolean isMonotonic(int[] A) {
      return increase(A)||decrease(A);
    }
    public boolean increase(int []A){
        int index = 0;
        while(index < A.length-1){
            if(A[index] <A[index+1]){
                return false;
            }
            index++;
        }
        return true;
    }
      public boolean decrease(int []A){
        int index = 0; 
        while(index < A.length-1){
            if(A[index] > A[index+1]){
                return false;
            }
            index++;
        }
        return true;
    }
}
// one pass
class Solution {
    public boolean isMonotonic(int[] A) {
    boolean in = true;
    boolean de = true;
        for(int i = 0; i < A.length -1; i++){
            if(A[i] < A[i+1]){
                in = false;
            }
            if(A[i]>A[i+1]){
                de = false;
            }
        }
        return in||de;
    }
}