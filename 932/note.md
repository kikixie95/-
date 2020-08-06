
为什么奇偶分开？为什么divide and conquer?
that’s say, we have two part: odd = {1, 5, 3}, even = {2, 4, 6}

any number from odd part and any number from even part will alway obey the rule A[k] * 2 != A[i] + A[j]

Ex: 5 from odd part, 6 from even part, for any k between 5 and 6, A[k] * 2 != 5 + 6

So merge two parts will form beautiful array!

具体流程：

odd (n * 2 - 1)     even (n * 2)
1 (1*2-1)       2 (1*2)
1 3(2*2-1)          2 4(2*2)
1 3 5(3*2-1)            2 4 6(3*2)