/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

// recursion
class Solution {
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        
        if(root == null) return res;
        for(Node node : root.children){
            postorder(node);
        }
        res.add(root.val);
        
        return res;
    }
}

// iterative
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
         LinkedList<Integer> res = new LinkedList<>();
        ArrayDeque<Node> stack  = new ArrayDeque<>();
        if(root == null) return res;
        stack.addLast(root);
        while(!stack.isEmpty()){
            Node parent = stack.pollLast();
            res.addFirst(parent.val);
            for(Node node : parent.children)
                    stack.addLast(node);   
                }
        
          return res;
           }
        
      
    }

// iterative v2
    /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
         LinkedList<Integer> res = new LinkedList<>();
        ArrayDeque<Node> stack  = new ArrayDeque<>();
        if(root == null) return res;
        stack.addLast(root);
        while(!stack.isEmpty()){
            Node parent = stack.peekLast();
            if(parent.children != null){
                Collections.reverse(parent.children);
                for(Node node : parent.children){
                    stack.addLast(node);   
                }
                parent.children = null;
            }else{
             Node tmp = stack.pollLast();
             res.add(tmp.val);
            }
         
            
        }
        
        return res;
    }
}
