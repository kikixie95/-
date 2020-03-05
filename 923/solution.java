class Solution {
    public int threeSumMulti(int[] A, int target) {
        int count = 0;
        int mod = (int)Math.pow(10, 9)+7;
       HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            count = (count + map.getOrDefault(target - A[i],0)) % mod;
            for(int j = 0; j < i; j++){
                map.put(A[i]+A[j], map.getOrDefault(A[i]+A[j],0)+1);
            }
        }
        
        return count;
    }
}