class Solution {
    public int maxDistToClosest(int[] seats) {
         int head = -1;
        int tail = 0;
        int ans = 0;
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == 1){
                head = i;
            }
            else{
                while(tail <seats.length && seats[tail] == 0 ||  tail <i){
                    tail++;
                }
             
                int left = 0;
                int right = 0;
                
                if(head == -1){
                    left = seats.length;
                }else{
                    left = i-head;
                }
                if(tail == seats.length){
                    right = seats.length;
                }else{
                    right = tail - i;
                }
                
                ans = Math.max(ans,Math.min(left,right));
                
            }
        }
        return ans;
            
    }
}