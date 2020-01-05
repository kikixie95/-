## 思路
###这题做的我要吐。。。 一个easy题搞了将近两个小时（疯了

### 一开始自己想的很简单，用hashmap记录坐标和值，然后遍历一遍另一个字符串就可以了。理想很丰满现实很残酷，这种方法会重复记录同一个值，hashmap也不支持不通过坐标删除某个值的方法，所以这个思路实现不了

### 接下来我想：“那我暴力双层循环总可以了吧”，呵呵， 还是不可以 ==
（此时也已经过去1个多小时了

### 去看看讨论区吧

### 大神的解法
- 创建一个数组secretDigits，记录secret这个string里的数字
- 创建一个数组correct记录guess猜的完全正确的坐标
- 遍历一遍secret字符串，如果与相同坐标的guess字符串的字符相同，就bulls++,correct[i]设为true；不相同，就将secretDigits[secret.charAt(i) - '0']++
- 接下来在遍历一遍guess字符串，若correct数组里没有，但secretDigits里此坐标的值大于0（大于0说明secret里有这个值，但坐标和guess的没对应上），就将cow++
- 最后返回bulls + "A" + cows + "B" 即可