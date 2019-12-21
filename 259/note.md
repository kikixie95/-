## 思路

### brute force

三层循环嵌套，复杂度为O(n^3)

### three pointers

for循环从index为0开始，low,high两个指针分别指向index为1和数组最后一位。如果nums[i] + nums[low] + nums[high] > target, high指针就向前移一位。 如果nums[i] + nums[low] + nums[high] < target, 那么count+=high-low, 然后将low向右移一位。