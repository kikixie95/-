# note

后序遍历： 先左子树，再右子树，最后根

iteratively:
1. while(root != null) stack.add(root); root = root.left；这样当前root即为最左的结点的左孩子（是个结点）；
2. 用一个指针cur指向当前的栈顶；用一个指针lastVis指向最近遍历过的那个结点；
3. 判断栈顶结点的右孩子是否为空或着是否遍历过；若为真，lastVis更新为栈顶弹出元素；res加入cur指向的结点的值；若为否，root = cur.right (说明这个结点的右子树还没遍历)；

以上三步放进一个while循环（stack不为空或者root！= null)