# note

**技巧：使用异或运算转换字母大小写**
    ```

        我们发现大写字符与其对应的小写字符的 ASCII 的差为 32，32 这个值如果敏感的话，它是 2^52 
        5 ，在编程语言中，可以表示为 1 << 5。而
        变换大小写这件事等价于：
        1、如果字符是小写字符，减去 32 得到大写字符；
        2、如果字符是大写字符，加上 32 得到小写字符。
        而这两者合并起来，就是给这个字符做一次不进位的加法，即异或上 1 << 5。

        这个大佬有点🐂🍺，异或相当于 不进位的加法

    ```

[大佬的讲解](https://leetcode-cn.com/problems/letter-case-permutation/solution/shen-du-you-xian-bian-li-hui-su-suan-fa-python-dai/)

