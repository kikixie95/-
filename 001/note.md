## 思路
 
### bf

用双层嵌套循环遍历数组

### two-pass hashmap

循环一遍数组，将数组内元素放入hashmap。再用一个变量存target-nums[i]的值。利用hashmap的key-value特性，判断是否存在此值；若存在，就返回index。

### one-pass hashmap

再循环数组的过程中，先判断target-nums[i]的值是否存在于hashmap中， 若存在，直接返回index； 若不存在，就将此元素存入hashmap。