class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1,mid;
        while(left < right){
            mid = (left +right)>>>1;
            if(nums[mid] > nums[right]){
                left = mid+1;
            }else if (nums[mid] < nums[right]){
                right = mid;
            }else{
                right = right-1;
            }
        }
        return nums[left];
    }
}