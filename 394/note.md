## 思路

### encoding的规则是k[encodeing_string] 即 num[substring]的形式。

### **自定义一个数据结构** Substring(num, String)。

### 开辟一个栈来存储Substring。 root为栈底， root(1, ""). 最后返回root.s。

### num的处理
当传入的string的某位是数字时，用一个变量count储存，` count = count*10 + (s.charAt(i) - '0');` 直至某位不再是数字。

### 当遇到`[`时
实例化一个Substring， 将count放入， 即`Substring(count,"")`。

### 当遇到`]`时
用一个Substring类型的变量存储栈顶的元素。 新建一个String evaluated。 将刚刚栈顶的元素处理一下（复制num遍后装入evaluated）， 查看此时栈顶的元素，并将刚刚处理后的evaluated拼接在栈顶的string后面。

### 当char是字母时
查看此时栈顶的元素，并将这个char拼接在栈顶的string后面。

## 注意
### 内部类
在外部内的内部在定义一个类。这个内部类作为外部类的一个成员，并且依附于外部类存在。 构造函数的写法和写外部类一致。
```java
 class Substring{
        int num;
        String s;
        
        public Substring( int num, String s){
           this.num = num;
           this.s = s;
        }        
    }
```

