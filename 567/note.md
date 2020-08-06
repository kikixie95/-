# note

这题和string里找anagrams很像
可以用数组来装字母出现的频率，然后用sliding window的思想来check两个数组是否相等，若相等，则说明是；
遍历长数组结束后还没有返回，则返回false