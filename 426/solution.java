/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    Node prev = null;
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        inorder(root);
        Node tail = root;
        Node head = root;
        while(tail.right != null){
            tail = tail.right;
        }
        while(head.left != null){
            head = head.left;
        }
        head.left = tail;
        tail.right = head;
        return head;
    }
    public void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        if(prev != null){
            prev.right = node;
            node.left = prev;
        }
        prev = node;
        inorder(node.right);
    }
}