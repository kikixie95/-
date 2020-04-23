# note

分两步：
1. 将单词和出现的坐标（用arrayList储存）用HashMap建立映射
2. 将两个单词对应的arraylist取出，在两个list里找差值最小值返回；这步可用双指针，双层for循环，二分搜索