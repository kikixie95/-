class Solution {
    public void nextPermutation(int[] nums) {
        int num = -1;
        if(nums.length < 2) return;
        for(int i = nums.length-1 ; i > 0; i--){
           if(nums[i-1]<nums[i]){
               num = i-1;
               break;
           }
        }
        if(num == -1){
            reverse(nums,0,nums.length-1);
            return;
        }
        int sm = 0;
        for(int i = nums.length-1 ; i > num; i--){
            if(nums[i] > nums[num]){
                sm = i;
                break;
            }
        }
        
        
        int temp = nums[num];
        nums[num] = nums[sm];
        nums[sm] = temp;
        
       reverse(nums,num+1,nums.length-1);
        
    
    }
    public void reverse(int[] arr, int start, int end){
        if(start > end){
            return;
        }
        for(int i = start; i <= (start+end)/2; i ++){
        int temp = arr[i];
        arr[i] = arr[start+end-i];
        arr[start+end-i] = temp;
        }
    }
}