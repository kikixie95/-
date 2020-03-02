# note

prefix sum + hashmap;

这道题给定了我们一个数字，让我们求子数组之和等于给定值的个数；
还是用prefix sum的套路，不过这次用hashmap存放；（先将map里放入（0，1））；

中心思想：
判断map中是否存在（sum-k);若有，count+=map.get(sum-k); 不管有没有，此key对应的value+1；

