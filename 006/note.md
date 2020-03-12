# note

- 将字符串转成char数组，创建一个string builder数组，大小和rowNums相等；
- 遍历char数组，一列列的填进string builder数组里
    + 先将numrows个元素放进string builder数组里；
    + 再从将元素放进string builder数组从row-2开始到>=1
- 最后将string builder数组append起来，转为string返回