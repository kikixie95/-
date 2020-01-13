## 思路

### DFS recursively
min_depth = Math.min(min_depth,minDepth(root.left))

### BFS iteratively
当某个结点没有子结点时返回depth;