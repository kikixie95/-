/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
   
         Map<Node, Node> map = new HashMap<>();
    
    public Node copyRandomList(Node head) {
        if (head == null || map.containsKey(head)) return map.get(head);
        
        Node node = new Node(head.val);
        
        map.put(head, node);
		// 处理 next 结点
        node.next = copyRandomList(head.next);
		// 处理 random 结点
        node.random = copyRandomList(head.random);
        
        return node;
        
    }
}

// iterative
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node>  map = new HashMap<>();
        Node curr = head;
        
        while(curr != null){
            map.put(curr,new Node(curr.val));
            curr = curr.next;
        }
        Node node = map.get(head);
        while(head != null){
          map.get(head).next = map.get(head.next);
          map.get(head).random = map.get(head.random);
          head = head.next;
        }
        
        
        return node;
        
    }
}