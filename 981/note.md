## 思路

### 数据的储存形式 
```

    key_1 :{(v1,t1),(v2,t2),(v3,t3),(v4,t4), (v5,t5)};
    ···
    key_n:{(v1,t1),(v2,t2),(v3,t3),(v4,t4), (v5,t5)};
```
**灵光一现，(v1,t1)这样的pair可以自己创建一个数据类型KeyTime去储存**

### 创建一个hashmap<String, ArrayList<KeyTime>>存放key,value, timestamp

### 查找最近的timestamp（即get(key, timestamp）里的 timestamp 需要 大于或等于 key对应的ArrayList<KeyTime>里 最后的一个符合要求的timestamp； 所以这里用二分搜索速度最快

