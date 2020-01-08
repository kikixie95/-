## 思路

### 又来一个自定义comparator的题～～～

### 这个题最根本的地方就是要解决到底是a+b大还是b+a大，所以可以创建一个comparator将array排个序，Arrays.sort(n, (a,b)->(b+a).compareTo((a+b))); b+a 和 a+b进行比较，返回正数就b在前, 负数就a在前。

### 注意可能会出现整个数组都是0的情况，所以一开始要加个判断