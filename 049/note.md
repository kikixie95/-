## 思路

### Hashmap法
- 将每个string排序，排过序的string作为key，anagrams作为list，存进hashmap；
- 遍历整个string array将string放进相应的list里
- 最后返回整个map.values即可

