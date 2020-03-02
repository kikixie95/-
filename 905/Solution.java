//use arraylist
class Solution {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                arr.add(0,A[i]);
        
            }
            else{
                arr.add(A[i]);
            }
        }
        int index = 0;
        
       for(int i : arr){
           A[index++] = i;
           }
       return A;
    }
}

// 用一个指针指向最前的那个odd
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int even = 0;
        for(int i = 0; i < A.length; i++ ){
            if(A[i] % 2 == 0){
                int temp =  A[even];
                A[even] = A[i];
                A[i] = temp;
                even++;
            }
        }
        return A;
    }
}