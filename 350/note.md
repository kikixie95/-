## 思路

### 三指针法
- 首先将两个数组从小到大排个序
- 三个指针都从0开始往右移动，三个指针(i, j, m)分别指向nums1,nums2 和nums1(结果). 当nums1[i] == nums2[j]时，nums1[m]赋值nums1[i]. 三个指针同时往右移一位。当nums1[i]的值较小时，i往后移一位，其他指针不动。 若nums2[j]的值较小时，j往后移一位，其他指针不动。 
- 终止条件是i或者j到达数组的长度
- 最后返回有个小妙招， 用  copyOfRange(int[] original, int from, int to) 方法返回结果。 这个方法的意思是Copies the specified range of the specified array into a new array.
