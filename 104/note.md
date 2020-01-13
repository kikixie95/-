## 思路

### BFS
一层层的遍历树（用queue）， 用一个变量记录每一层树的个数，每遍历完一层，depth +1，最后返回depth;

### recursively
```java
Math.max(maxDepth(root.left),maxDepth(root.right)) +1
``` 