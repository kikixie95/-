# note

分两步：
第一步： 将数组的（0，k-1）和（nums.length-k,nums.length)两部分的元素对调；
        e.g: [1,2,3,4,5] k=2; -> [5,4,3,2,1]

第二步： 将（0，k-1）的元素相互对调，将（nums.length-k,nums.length)的元素也对调
        [5,4,3,2,1] ->[4,5,1,2,3] 

一二两步的对调方式一致，可以单独写一个reverse function直接调用