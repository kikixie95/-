# note

**单调栈+HashMap+HashSet**

- 遍历一遍数组，记录每个char出现的次数
- 维持一个单调递增的栈，
- 若当前char等于栈顶元素，map对应的value -1， continue
- 若(当栈为不为空 && 当前的char小于栈顶 && 栈顶的元素在hashmap中的value > 0;) 移出栈顶元素，set也移除此元素
- 将当前元素放进栈顶，set也加入此元素，map对应的value -1

