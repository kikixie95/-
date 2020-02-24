# note

当sum[i] == k，那么i+1也是待定长度；
当sum[i] - sum[j] == k,那么i-j就是sum == k的区间，可以待定；
当hashmap里没有sum[i]这个key时，可以将sum[i]放入hashmap；保存prefixSum；
