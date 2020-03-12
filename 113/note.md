# note

**DFS+Backtracking**

老套路
递归出口： 当前结点为null
递归过程：将当前结点加入list，判断当前结点的值与remainsum是否相等，若是，res加入此list；若不是，递归调用自身，更新node和remainsum的值；最后将list里最后一个元素remove；
