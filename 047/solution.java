class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permuteUnique(int[] nums) {
        res = new ArrayList();
        Arrays.sort(nums);
        
        helper(nums,new ArrayList<Integer>(),new boolean[nums.length]);
        return res;
    }
    public void helper(int[] nums,ArrayList<Integer> arr,boolean[] visited){
        if(arr.size() ==  nums.length){
            res.add(new ArrayList<Integer>(arr));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;
            if(i != 0 && nums[i]== nums[i-1] && visited[i-1]){
                break;
            }
                arr.add(nums[i]);
                visited[i] = true;
                helper(nums,arr,visited);
                arr.remove(arr.size()-1);
                visited[i] = false;
        }
    }
}