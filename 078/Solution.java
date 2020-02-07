
class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> visited = new ArrayList<>();
        Backtrak(nums,0,res,visited);
        res.add(new ArrayList<Integer>());
        return res;
    }

    public void Backtrak(int[] nums,int depth,List<List<Integer>> res, ArrayList<Integer> visited ){   
        for(int i = depth; i < nums.length; i++){
            visited.add(nums[i]);
            res.add((ArrayList<Integer>)visited.clone());
            Backtrak(nums, i+1,res, visited);
            visited.remove(visited.size()-1);
        }
    }
}