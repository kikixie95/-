class Solution {
     List<List<Integer>> res;
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList();
        Arrays.sort(nums);
        helper(nums, 0,new ArrayList<Integer>() );
        return res;
    }
    public void helper(int[] nums, int index,ArrayList<Integer> arr){
       res.add(new ArrayList<Integer>(arr));
        
        for(int i = index; i < nums.length; i++){
            arr.add(nums[i]);
            helper(nums,i+1, arr);
            arr.remove(arr.size()-1);
            while(i+1 < nums.length && nums[i] == nums[i+1]){
                i++;
            }
        }
    }
}