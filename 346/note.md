## 思路

### 迭代式求sum 时间复杂度O(n)

如果queue的size == sliding window的大小，就要将queue的头元素poll出来，add新的元素进去，sum = queue的所有元素之和；

### sum动态求和

如果queue的size == sliding window的大小，sum就等于sum减去queue的poll出来的头元素的差，再把新的元素加入sum中。


