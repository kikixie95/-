## 思路

### hashmap && hashset

将所有的数组元素装进hashmap里， key存元素值，value存出现次数。
再将所有的value装进hashset里。
比较hashmap和hashset的size，若一致，则说明没有重复次数一致的元素，若不同，则说明存在至少两个元素重复次数相同。

**重点**

集合里是不存在重复元素的，hashset就是一个集合