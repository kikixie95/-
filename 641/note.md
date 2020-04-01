# note

**用数组实现双向循环队列**
**最最重要的是确定队空和队满的条件**
(tail 指向队列尾部下一个可插入的位置， head指向队首第一个元素)
- 队空：head == tail
- 队满：(tail + 1) % arr.length == head; 
- 队首插入：先判断队列是否满了；若未满，head向前一位（(head+arr.length-1) % arr.length），arr[head] = value;
- 队尾插入：先判断队列是否满了；若未满，arr[tail] = value; tail向后一位（(tail+1) % arr.length）
- 队首删除：先判断队列是否为空；  若不为空，arr[head]=-1; head向后一位（（head+1) % arr.length）
- 队尾删除：先判断队列是否为空；  若不为空，tail向前一位（(tail+arr.length-1) % arr.length），arr[tail] = -1;
