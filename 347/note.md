## 思路

### 这题又碰到了java的Comparator with Lambda。。。。
### 还用到了heap这个数据结构（heap默认是最小的值在堆顶）

- 首先用hashmap把数字和出现的次数一一映射
- 用comparator自定义函数，按value的大小定key的存放顺序
- 用hashmap.keySet去遍历所有的key,将key放进heap, 若heap的大小超过k的值时，就heap.poll()；此时poll出来的是value最小的key
- 最后把heap里所有的key放进list里，再按value的大小从大到小排个序（reverse list即可）
- return list