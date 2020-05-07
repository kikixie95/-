# note

用hashset储存node的值，遍历树的过程中去确认set里是否有target-node.val的值，若有可以直接返回true；遍历结束还没有，返回false；