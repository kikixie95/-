# note

隔了好久，又重新开始刷题了。。。

题目是想要返回子树最大的平均数；

思路很清晰，recursive traversal；

用一个全局变量 res存放结果；

helper函数遍历整棵树，每颗子树的avg都和res打擂台

最后在主函数调用helper返回res即可