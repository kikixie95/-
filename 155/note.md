# note
用一个变量min记录当前的最小值；

往栈里push元素时，先将这个元素与min比较大小；若不比min大，先将min push进栈，再将这个元素的值赋予min，再将这个元素push进栈； 若比min大，直接将此元素push进栈

pop元素时，检查pop出来的元素是否等于min，若是，再把remove出来的元素（此时时remove的第二次）赋值给min

