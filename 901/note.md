# note

用stack 数据结构来储存股票价格和result，while循环比较当前价格和栈顶价格，若栈顶小，则pop栈顶元素，res+=pop的res；最后push进当前价格和res；