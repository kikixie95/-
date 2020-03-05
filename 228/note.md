# note

**双指针**

一个指针指向subarray的头部，一个指针遍历向后遍历（比较后一位是否 == 当前元素+1，若是continue）；

当头部指针和另一个指针指向同一个元素，说明这个元素单独是一个subarray；
else，向list里添加 start -> i；

start = i+1;
