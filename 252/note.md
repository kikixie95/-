## 思路

### 这题本来没咋明白， 今天又做了个用到自定义comparator的，也用了lambda，就有种恍然大悟的感觉。。。

### 第一次做的时候，自己尝试写了个按endtime给二维数组排序的方法，结果慢的可以。。。（不知道用快排会不会好点）

### 今天用了Array.sort(array, Comparater)的方法。 用lambda定义按a[1]-b[1]排序，（按亮亮的解释）负数表示小于，0 表示等于，正数表示大于。 

### 按endtime将二维数组排完序后只需要check下，endtime是不是小于下一行starttime即可，若是，则继续，若不是，直接返回false.