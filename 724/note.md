# note

**prefix sum;**

遍历数组一遍数组，sum = 整个数组的和
再次遍历数组，判断leftsum + nums[i]和sum-leftsum 是否相等，若相等，返回i;
遍历完都没返回的话，说明数组里不存在这个pivot； 返回-1；
