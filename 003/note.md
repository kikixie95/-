## 思路

### 我的愚昧解法
head指向string的头部， tail遍历剩下的部分（并将字符放进hashset里）；当set里有tail目前指向的字符，记录下目前的set大小，并与之前记录的最大长度比较，留下较长的；head右移一位，tail回到head的右一位。 hashset重置。重复之前的步骤。

### 亮亮的机智解法
![note](/image/nn.jpg)

head和tail只用遍历一遍整个字符串。head指向重复字符的左边一位，并在右移的过程中将set中的元素移除。 tail继续右移。

