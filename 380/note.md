#  note

题目要求：设计一个数据结构，在O（1）的时间复杂度里实现 增，删，随机查询；

可以用一个hashmap和arraylist来实现：
- hashmap<val,index>，ArrayList<val>;
- 删除时有个坑：list删除后，空出来的位置不会自动消失，所以需要操作一下；我们先将list里最后一个元素记录下来，替换到要删除的位置，更新下map里list里最后一个元素的mapping；再将map里val的set删掉。list将最后一个元素删掉即可
- 随机查询要求每个位置被查到的几率一致，我们调用Java里的random类来辅助完成。