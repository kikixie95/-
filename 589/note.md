## 思路

###iteratively
用一个stack装遍历过的结点， 用另一个list装结果

遍历子结点时，要将结点的反转以后再装入stack；

![iter](/image/0116.jpg)

### recursively

写一个helper方法，用和iterative一样的处理方式处理结点和res