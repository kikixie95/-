# note

- 递归出口：当前结点为null,返回false; 或者，当前结点的左右子结点皆为空（意味着当前结点是叶子结点）并且sum减去当前结点的val等于0，则说明这条路径的sum== target sum；
- 过程： 返回 hasPathSum(root.left,sum - root.val) || hasPathSum(root.right,sum - root.val);