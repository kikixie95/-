## 思路

### hashmap one-pass 

和two sum一个思路

### two pointers

头指针从[0]开始，尾指针从numbers.length-1开始； 如果numbers[头指针] + numbers[尾指针] == target，就返回 [头指针+1， 尾指针+1]；如果numbers[头指针] + numbers[尾指针] >target, 尾指针-1；反之，头指针+1.
