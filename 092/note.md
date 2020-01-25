## 思路

### 创建dummy哨兵结点；dummy.next为head;
- 找到翻转链表的前一个位置记为 start， 翻转第一个记为tail

- 翻转中间部分链表 ![image](/image/092)
- 翻转完毕时，cur指向的是反转链表的后一位，将tail.next = cur; 再将start.next = cur即可

- 特殊情况： 从链表的第一位就开始反转，即start == dummy； 此时翻转完毕后，pre为链表头， tail为翻转的尾部，只用将head = pre; tail.next = cur即可；