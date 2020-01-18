## 思路

### recursion
按后序遍历的顺序遍历整棵树即可

### iterative version  1
利用Stack后进先出的特点模拟后序遍历去遍历整个树，最先进栈的是root,所以按从后往前的顺序放入result Linkedlist里

### iterative version 2

也是利用stack的特点模拟后序遍历，但进栈之前，要先判断栈顶元素的子结点是否都为空，若是，将栈顶元素移出并将其val放入res里，若不是，则将其子结点reverse以后再放入栈中，然后将这个结点的children都设为null;