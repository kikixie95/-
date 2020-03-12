# note

两个指针分别从字符串的两端往中间移动；若分别指向的元素不相等，则check（left+1，right）和 （left,right-1)这两段是否回文，若不是，返回false