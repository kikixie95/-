class Solution {
    public int removeDuplicates(int[] nums) {
      int count = 1;
        int num = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[num]){
                count++;
               nums[++num] = nums[i];
               
            }
        }
        return count;
    }
}