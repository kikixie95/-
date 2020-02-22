// # Given a collection of distinct integers, return all possible permutations.

// # Example:

// # Input: [1,2,3]
// # Output:
// # [
// #   [1,2,3],
// #   [1,3,2],
// #   [2,1,3],
// #   [2,3,1],
// #   [3,1,2],
// #   [3,2,1]
// # ]

class Solution {
  List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(new ArrayList<Integer>(),new HashSet<Integer>(),nums);
      return res;
    }
  
   public void helper(ArrayList<Integer> path, HashSet<Integer> set, int[] nums){
     
     if(path.size() == nums.length){
       res.add((ArrayList<Integer>)path.clone());
       return;
     }
     
     for(int i = 0; i < nums.length; i++){
       if(!set.contains(nums[i])){
         path.add(nums[i]);
         set.add(nums[i]);
         
         helper(path,set,nums);
         
         set.remove(nums[i]);
         path.remove(path.size()-1);
         
       }
     }
     
   }
}
