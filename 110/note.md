## 思路

### Top down的方式

用一个helper method去计算node的深度，再在判断是否balance的方法里去重复调用这个method；**注意这里**，要返回利用helper method的值计算差值是否<2，同时调用自身函数参数是left和right子结点