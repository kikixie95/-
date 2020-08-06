class Solution {
    List<List<Integer>> res;
   
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList();
        Arrays.sort(candidates);
        helper(candidates,target,0,new ArrayList<Integer>());
        return res;
    }
    public void helper(int[] nums, int remain, int idx, ArrayList<Integer> arr){
     
        if(remain == 0){
            res.add(new ArrayList<Integer>(arr));
            return;
        }
        for( int i = idx; i < nums.length; i++){
            if(nums[i]>remain) break;
            if(i>idx && nums[i-1] == nums[i] ) continue;
            
             arr.add(nums[i]);
            helper(nums,remain-nums[i],i+1,arr);
            arr.remove(arr.size()-1);
        
        }
    }
    
}