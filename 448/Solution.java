class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
  
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int num = Math.abs(nums[i])-1;
            if(nums[num]>0){
                nums[num] = -nums[num];
            }
        }
        
         for(int i = 0; i < nums.length; i++){
             if(nums[i]>0){
                 list.add(i+1);
             }
         }
        return list;
    }
}