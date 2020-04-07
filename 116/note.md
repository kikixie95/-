# note

### recursive
    将根的左右子树进行递归
    如果左结点和右结点都存在，左结点.next -> 右结点
    再将左结点的左子结点和右子结点、右结点的左子结点和右子结点 以及 左结点的右子结点和右结点的左子结点 共同进行递归

### iterative
    用一个queue，通过出对入队进行层次遍历
    当queue不为空时，变量size记录queue的大小（当前层结点的个数）；**当i<size-1时（i==size-1时，当前的结点为最右的）queue.poll.next = queue.peek；


