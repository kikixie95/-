
class Solution {
    public int maxSubArray(int[] nums) {
      int res = Integer.MIN_VALUE;
      int[] prefixSum = new int[nums.length+1];
      
      prefixSum[0] = 0;
      int cum = 0;
      for(int i = 0; i < nums.length; i++){
            cum += nums[i];
            prefixSum[i+1] = cum;
      }
        
     int min = prefixSum[0];
     
      
      for(int i = 1; i < prefixSum.length; i++){
          
          res = Math.max(prefixSum[i] - min,res);
          
          if(prefixSum[i] < min)
              min = prefixSum[i];
            
      }
      return res;
    }
}