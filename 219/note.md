# note

##方法一： 双指针； 指针i遍历数组， 指针j指向i到i+k+1范围内的数字，若有nums[i] == nums[j]，返回true；若遍历结束还没有返回true，返回false

## 方法二：hashset；遍历数组，维持一个size==k的set；若遍历数组时发现某个数字存在于set中，返回true； 遍历结束返回false；