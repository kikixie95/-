# note

考虑当前结点的状况；
若当前结点为null return“”
若当前结点的左右结点都为null return node.val+“”
若当前结点的右结点为null return node.val+ 递归左结点

迭代就利用一个stack和一个hashset和一个stringbuilder
stack模拟前序遍历树，hashset储存visited node 
若visited 里有这个node，sb.append(")")，并将这个node从stack里去除
若没有，就将visited里加入这个node，s.append("("+node.val),如果node的左边为null，右边不是，则append（“（）”）； 若右边不为null，将右结点放入stack；若左边不为null，将左结点加入stack
当stack为空后，返回s.substring(1,s,length()-1)[这个范围是前闭后开，为了去除多余的一个完整括号）