# note

题目其实就是要找事都存在一个结点，其他所有的点都指向它，但是它不指向任何一个结点；不存在返回-1；
可以用两个数组，分别记录所有结点向外指出的个数，和被指的个数；再同时遍历这两个数组，若in[i] ==  N-1&& out[i] == 0;返回i；

In graph theory, we say the outdegree of a vertex (person) is the number of directed edges going out of it. For this graph, the outdegree of the vertex represents the number of other people that person trusts.

Likewise, we say that the indegree of a vertex (person) is the number of directed edges going into it. So here, it represents the number of people trusted by that person.

We can define the town judge in terms of indegree and outdegree.