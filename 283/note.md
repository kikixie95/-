# note

用一个指针pointer指向数组的头部，另一个指针i遍历整个数组；当nums[i]不为0时，nums[pointer] = nums[i]; pointer往后挪一位；
最后将pointer后面的位置全部用0补全；