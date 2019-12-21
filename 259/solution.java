// brute force
class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int count = 0;
        
        for(int i = 0; i < nums.length-2; i++){
           
            for(int j = i+1; j < nums.length-1; j++){
                
                for(int k = j+1; k < nums.length; k++){
                    if(nums[i]+nums[j]+nums[k] < target){
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}

// three pointers
class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        int count = 0;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-2; i++){
            
            int low = i+1;
            int high = nums.length-1;
            
            while(low < high){
            if(nums[i] + nums[low] + nums[high] < target){
                count = count + high - low;
               low++;
            }else {
                 high-- ;
            }
            }
            
        }
       
        return count;
    }
}


