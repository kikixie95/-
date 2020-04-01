# note

分两部想：
1. 首先将这颗树的结点按ascending order放进Arraylist里
2. 再recursively重构这颗树

第一步：就直接inorder traverse 
第二步：和二分搜索的思想有点类似，root是list中间的结点，list的左部分是root的左子树，list的右部分是root的右子树；递归着去重构；递归出口是当前list为空