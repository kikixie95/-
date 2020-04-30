# note
1. 用一个新的数据结构Num,存放new num的（值[自身储存的idx*自身的prime]，自身储存的idx+1,自身的prime),放进heap里（按值的大小);
2. 用一个ArrayList存放生成的new num
3. 最后返回arraylist.get(n-1)的值