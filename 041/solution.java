// create a new array
class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] > 0 && nums[i] <= nums.length) 
            res[nums[i]-1]  = nums[i];
        }
        
        int index = 0;
        while(index < res.length){
            if(res[index] != index + 1)
                return index+1;
            index++;
        }
        return  ++index;
        
    }
}

//implement on the origin array
class Solution {
    public int firstMissingPositive(int[] nums) {
        int index = 0;
        while(index < nums.length){
            if(nums[index] <= 0 || nums[index] > nums.length) {
                index++;
            }else if(nums[index] == index+1|| nums[nums[index]-1] == nums[index]) {
                index++;
            }else if(nums[index] != index+1){
                int tmp = nums[nums[index]-1];
                nums[nums[index]-1] = nums[index];
                nums[index] = tmp; 
            }
    }
        
        index = 0;
        while(index < nums.length){
            if(nums[index] != index + 1)
                return index+1;
                index++;
        }
        return  ++index;
        
    }
}