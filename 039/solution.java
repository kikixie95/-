class Solution {
     List<List<Integer>>res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList();
        helper(candidates,target,0,new ArrayList<Integer>());
        return res;
    }
    public void helper(int[] nums,int rm,int idx,ArrayList<Integer>arr){
        if(rm < 0) return;
        if(rm == 0){
            res.add(new ArrayList<Integer>(arr));
            return;
        }
        for(int i = idx; i < nums.length; i++){
            arr.add(nums[i]);
            helper(nums,rm-nums[i],i,arr);
            arr.remove(arr.size()-1);
        }
    }
}