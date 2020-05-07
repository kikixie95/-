# note

当mid的值比right的值大，则说明目前【mid-right]这段是含有最小值的【0-mid】这段是有序的；
所以
当 mid > right时， left = mid+1; 反之，right = mid;
最后返回nums[right]