class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        if(nums.length<1) return res;
        if(nums.length<2) {
            res.add(nums[0]);
            return res;
        } 
        int maj1 = nums[0];
        int maj2 = nums[1];
        int count1 = 0;
        int count2 = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(maj1 == nums[i]) count1++;
            else if(maj2 == nums[i]) count2++;
            else if(count1 == 0){
                maj1 = nums[i];
                count1++;
            }else if(count2 == 0){
                maj2 = nums[i];
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        
        int maj_t1 = 0;
        int maj_t2 = 0;
        for(int num : nums){
            if(num == maj1) maj_t1++;
            else if(num == maj2) maj_t2++;
        }
        int len = nums.length/3;

        if(maj_t1 > len)
            res.add(maj1);
        if(maj_t2 > len)
            res.add(maj2);
        return res;
        
    }
}