# note

## 题意解读：
- 字符串要被分为四部分
- 每部分的取值范围在[0-255]之间
- 0可以单独成一个字段，但不可以出现类似011这种情况
- 打印所有可能的组合

## Backtracking
- 用一个arraylist res存放最终答案， 一个arraylist arr存放递归中符合条件的一个IP地址
- 递归出口，当arr的长度为4，且字符串遍历完毕，则将此arr加入res,return； 当arr长度为4 **或者**字符串遍历完毕，直接return
- 用一个checkstatus方法判断当前数字是否符合要求；
- 递归后要将arr的最后一个元素移出（backtracking的精髓）
