## 将树转换成图是这题的突破点
## 遍历一遍树，将当前结点的子、父结点装进hashmap<Node, arraylist>里；-->这步就是画图
## 再用BFS遍历这个图，创建新的数据类型<Node, level> 记录结点及其层数； 当level==K时，将queue里剩余结点poll出来，不用将其child再装入queue中；