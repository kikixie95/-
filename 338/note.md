## 思路

### Integer.bitCount()

java的built in function，可以计算数字二进制1的个数

### 不用built in function

**发现规律**
0-3 的二进制1的个数为[0,1,1,2]

4-7 的二进制1的个数为[1,2,2,3], 即0-3的1的个数+1.

8-15的二进制1的个数又是 0-7的1的个数+1.

**解题思路**
先将前四个的二进制里1的个数写出来，作为一个基础，创建一个ArrayList。

然后再定count为4，进入while循环，将前四个的个数+1后再存入ArrayList.

此时判断num和count的大小关系，若num > count, 就break退出循环；反之，则将count * 2 ，重复之前的操作。

退出循环后，初始化一个num+1大小的数组，将ArrayList里的数遍历放入数组，最后返回这个数组即可。


