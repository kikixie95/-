## 根据UNIX-style file system的规则， 一个点表示当前目录，两个点表示返回上一层

## 用一个ArrayDeque来存放路径； 遍历split by '/' 后的路径，若遇到一个点，则继续；若遇到两个点，则将ArrayDeque里最后一个元素remove；其他情况则将path的元素放到ArrayDeque的最后；

## 当ArrayDeque为空时，返回一个'/'； 其他情况下，将元素从ArrayDeque的头部取出，放入字符串中，最后返回字符串即可