//iteratively

class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        if(n==1 || n==2) return 1;
        
        int a = 0, b = 1, c = 1;
        int tmp =a + b + c;
        for(int i = 3; i < n; i++){
             a = b;
            b = c;
            c = tmp;
            tmp = a + b + c;
        
        }
        
        return tmp;
    }
}

