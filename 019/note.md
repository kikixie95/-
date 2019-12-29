## 思路

### 新建一个哨兵结点dummy, dummy.next 指向 head
### 新建两个快慢指针， 快指针比慢指针快n+1步；当快指针为空时，慢指针当前位置正好是要删除结点的前一位，此时只需将slow.next指向slow.next.next即可； 返回dummy.next
