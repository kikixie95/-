# note

采用中序遍历，在遍历过程中保存上一次访问的结点prev

每次遇到新结点，使得prev.right = root, root.left = prev, 这样就得到了每个节点的前后指针

用 一个 head 和 tail 结点定位链表的头尾，将头尾连接起来
