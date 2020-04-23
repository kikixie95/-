# note

用treeMap，可以保证key是从小到大排序的

遍历key，若key < 0,则对应值是key/2; 若key>0,则对应值是key*2;
**当key<0时，要判断下key%2是否==0，当map.get(key)>map.get(want)时，返回false**
更新want的对应value值，want-key

