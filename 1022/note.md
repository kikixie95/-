# note
    
    用DFS遍历整棵树，遍历的过程中就将2进制转换成10进制
    - helper function里传入的参数为node和之前path的和value

    当root == null时，返回0；
    当root != null时，当前的 value = 2 * value +node. val

    当root.left == root.right == null 时；返回当前的val 