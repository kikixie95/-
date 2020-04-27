//greedy
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length;i++){
            if(max < i || max >= nums.length-1) break;
            max = Math.max(max, nums[i]+i);
        }
        return max  >= nums.length-1;
        
    }
}

//dp
class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 1; i < dp.length; i++){
            dp[i] = Math.max(dp[i-1],nums[i-1])-1;
            if(dp[i]<0){
                return false;
            }
        }
        return true;
        
    }
}