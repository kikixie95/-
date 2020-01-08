class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] new_nums = nums.clone();
        int index1 = 0;
        int index2 =  nums.length - 1;
        Arrays.sort(new_nums);
        if(Arrays.equals(nums,new_nums)) return 0;
       int i = 0;
        while ( i < index2){
            if(nums[i] != new_nums[i]){
                index1 = i;
                break;   
            }
            i++;
        }
        
        i = nums.length - 1;
        while( i > 0){
            if(nums[i] != new_nums[i]){
                index2 = i;
                break;   
            }
            i--;
        }
        return index2-index1 + 1;
    }
}