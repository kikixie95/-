## 思路

**得到queue队尾的元素的方法：**

创建一个新的queue，将原queue前n-1个数全部poll出来，放入新queue里。 再次从原queue里poll出来的元素就是队尾（栈顶）的元素。**操作完成后，要记得将新queue里的全部元素再放回原来的queue**。

