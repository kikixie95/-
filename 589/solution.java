//iteratively
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
    public List<Integer> preorder(Node root) {
       
       LinkedList <Node> Stack = new LinkedList<>();
       LinkedList <Integer> res= new LinkedList<>();
        

       if(root == null) return res;
        
        Stack.addLast(root);
        
        while(Stack.size() != 0){
            Node papa = Stack.pollLast();
            res.addLast(papa.val);
             Collections.reverse(papa.children);
            
            for(Node n : papa.children){
                Stack.addLast(n);
            }
        
     
    }
          return res; 
    }
}

//Recursively

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
    
    public List<Integer> preorder(Node root) {
  
       LinkedList <Integer> res= new LinkedList<>();
        
         if(root == null) return res;
          helper(root,res);
        return res;
    }
    
    
    public void helper(Node node,List<Integer> res ){
 
        if(node == null) return;
        res.add(node.val);
        if(node.children !=  null) {
            for(Node n : node.children){
               helper(n,res);
            }
    }
}
}