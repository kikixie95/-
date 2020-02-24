class Solution {
    public int countPrimes(int n) {
        if(n<3)  return 0;
        int count = 0;
        boolean[] notPrime = new boolean[n];
        for(int i = 2; i < n; i++){
            // if the number is prime, the value of the index i is false;
            if(notPrime[i] == false) {
                count ++;
                for(int j = 2; i*j < n; j++){
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }
}