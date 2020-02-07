/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     HashMap<TreeNode, ArrayList<TreeNode>> map = new  HashMap<>();
     HashSet<TreeNode> visited = new HashSet<>();
    int num = 0;
    ArrayList<Integer> res = new ArrayList<Integer>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        inOrder(root, null, num);
        BFS(target,K);
        return res;
    }
    class Node{
        int level;
        TreeNode node;
        public Node(int level,TreeNode node){
            this.level = level;
            this.node = node;
        }
    }
    
  
    public void inOrder(TreeNode root, TreeNode parent,int num){
        if(root == null) return;
        map.put(root, new ArrayList<TreeNode>());
        if(root.left != null)  map.get(root).add(root.left);
        if(root.right != null) map.get(root).add(root.right);
        if(parent != null) map.get(root).add(parent);
        inOrder(root.left,root,num++);
        inOrder(root.right, root,num++);
    }
    
   public void BFS(TreeNode target,int K) 
    {  
  
       ArrayDeque<Node> queue = new ArrayDeque<Node>(); 
  
       visited.add(target);
        queue.add(new Node(0,target)); 
  
        while (queue.size() != 0) 
        { 
            Node poll = queue.poll();  
            
            if(poll.level == K)  res.add(poll.node.val);
                
                for(TreeNode child : map.get(poll.node))
                { 
                    if (!visited.contains(child)) 
                    { 
                        visited.add(child); 
                        queue.add(new Node(poll.level+1,child)); 
                        
                    }

                }
            
            }
            
        }
    }
