## 思路

### iteration

用queue模拟层次遍历树的过程

**在出队前将这个结点的children入队**

### recursion

其实并没用按照BFS的过程去进行递归，而是在按先序遍历递归的过程中记录level和node的值，再将同一个level的值放在一个arraylist里