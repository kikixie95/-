
// two pointer
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
        for(int i = 0; i < nums.length-1; i ++){
            int j = i+1;
            while(j < nums.length){
                if(nums[i] == nums[j] && j-i<=k) return true;
                else j++;
            }
        }
        return false;
    }
}
//hashset
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
       HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size() > k) set.remove(nums[i-k]);
        }
        return false;
    }
}