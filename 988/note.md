## 思路

### 方法一：DFS遍历整棵树，每一条路径都用一个String Builder记录，再比较每个string的字典大小
- 递归出口： 结点为null时，返回；
- 过程：DFS遍历树，当前结点的左右子结点都为空时，说明当前结点为叶子结点；这时将String builder反转，变成string,与之前的全局变量最小string进行比较，若该string小，赋值给全局变量最小string
-  `helper(node.left,new StringBuilder(sb.toString()));`
   `helper(node.right, new StringBuilder(sb.toString()));`

### 方法二：BackTracking; 每遍历完一条路径，String Builder会删除掉当前结点的字符；递归全部完成时，stringbuilder是空的；

- 递归出口： 结点为null时，返回；
- 过程：DFS遍历树，当前结点的左右子结点都为空时，说明当前结点为叶子结点；这时将String builder反转，变成string,**再将sb反转**，新的string与之前的全局变量最小string进行比较，若该string小，赋值给全局变量最小string
- `helper(node.left, sb);`  
  `helper(node.right, sb);`
  `sb.deleteCharAt(sb.length()-1);`
   
### 很灵性的操作：
- string builder append字符时，由于树里结点的值都是数字，转换为字符的话以'a'为base，(char)('a' + node.val)即为当前结点的字符；