// Binary Search
class Solution {
    public int mySqrt(int x) {

        int left = 1, right = x;
        while(left <= right){
            int mid = left + ((right-left)>>1);
            if(mid == x/mid) return mid;
          else if(mid > x/mid) right = mid -1;
            else left = mid+1;
        }
        return right;
        
    }
}

//iterate all numbers
class Solution {
    public int mySqrt(int x) {

        if( x < 2) return x;
        
        
        for(int i = 1; i <= x; i++){
            if(i*i == x) return i;
           else if(i*i<0||i*i > x &&(i-1)*(i-1)<x) return i-1;
        }
        return 0;
    }
}