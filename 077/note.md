# note

combination 类型的题， 用backtracking + recursion 解决； 每次recursion结束时，将最后一个元素弹出，再进行recursion；最后临时储存答案的arraylist应该为空； 所以，append这个arraylist到最终答案里时，要储存一个深拷贝；