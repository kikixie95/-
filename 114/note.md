# note

### recursive
    可以看到，最后形成的链表其实是是 preorder顺序的
    写一个helper function返回链表尾部的node

    往helper function里传入一个node，递归的求出左子树和右子树，将左子树的最尾部的结点放入leftTail,右子树的最尾部的结点放入rightTail；

    当node.left ！= null时，leftTail.right = node的右子树；
    node的右子树 = node的左子树；再将node的左子树置为空；

    如果node有右子树，就返回rightTail，若没有，返回leftTail