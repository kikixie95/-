class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
      
        for(int start = 0, i = 0; i < nums.length; i++){
            if(i+1<nums.length && nums[i]+1 == nums[i+1]){
                continue;
            }
            if(start == i){
                res.add(nums[start]+"");
                
            }else{
                res.add(nums[start]+"->"+nums[i]);
            }
             start = i+1;
        }
        
        return res;
        
    }
}