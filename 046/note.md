# note
permutation题 和 combination题是有点差别的；
combination题顺序不同也算一样，permutation是看这数组里的元素有多少种排列的方式（顺序不同算多个答案）

这题用recursion+backtracking法做；
（亮亮说backtracking有套路的）
1. return放前面
2. 一层for循环遍历数组，path arraylist存放nums[i]
3. 紧接着循环里 一条if语句检查路径有没有相同元素
4. recursion这个方法
5. 紧接着移出这个元素

3.4.5点是也在一个if条件语句里的；
