# note

### 知识点1:
 欧几里得 Euclid 算法 得到最大公约数 gcd(a,b)：
 - 如果b 除以a能 整除，则最大公约数是a
 - 否则，最大公约数等于b%a和a的最大公约数；


### 知识点2:
最小公倍数：least common multiple
-  a*b / gcd(a,b)

### 第n个只能被a,b,c整除的数
任意一个数m,m/a得到能被a整除的个数，同样可得到能被b,c整除的个数； m/lcm(a,b)得到能被a,b同时整除的个数吗，同理可得到被bc,ac整除的个数；m/lcm(a,lcm(b,c))可得到同时可被a,b,c整除的个数；通过集合的概念可知，能被a,b,或者c整除的个数为a + b + c- ab-bc-ac+abc;

m / a + m / b + m / c – (m / LCM(a,b) + m / LCM(a, c) + m / LCM(b, c) + m / LCM(a, LCM(b, c))



