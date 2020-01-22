## 思路

### 这题挺简单的啊。。。为什么之前没有做出来噢

### 实例化一个stringbuilder result，将整个字符串以空格为分隔符分成一个个单词装入数组里，遍历整个数组，将每个string用StringBuilder实例化，反转，再变回string，append进result,再加上一个空格；最后的答案要trim()掉最后一个空格