# note

- 用一个指针index指向数组的下一个，另一个指针ans指向修改过的元素的位置；
- 遍历整个数组，用char cur纪录当前char的值，往后遍历对比，若一致，count++，index++；
- 若不同，chars[ans] = cur，判断count是否为1；若不是，将count转换成char数组放入chars[ans++]
- 最后返回ans