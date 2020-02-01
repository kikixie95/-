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
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
       
        boolean flag = false;
        TreeNode nodeX = null;
        
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
            if(root == null) return true;
            TreeNode player1 = findX(root,x);
            int Fplayer1 = BFS(player1);
            int leftPlayer1;
            int rightPlayer1 ;
        // System.out.println(Fplayer1);
           if(player1.left != null)  leftPlayer1 = BFS(player1.left);
            else leftPlayer1 = 0;
        //System.out.println( leftPlayer1);
            if(player1.right != null)  rightPlayer1 = BFS(player1.right);
             else rightPlayer1 = 0;
        int player2 = Math.max((n-Fplayer1),Math.max(leftPlayer1,rightPlayer1));
           
        if(player2 -(n-player2) >0) return true;
        else return false;
        }
    public TreeNode findX(TreeNode root, int x){  
        TreeNode dummy = root;
        queue.add(dummy);
        while(flag == false){
           dummy = queue.removeFirst();
            if(dummy.val == x) {
                flag = true;
                nodeX = dummy;
                queue.clear();
            }
            
            else {
                if(dummy.left != null ) queue.add(dummy.left);
                if(dummy.right != null) queue.add(dummy.right);
            
            }
        }
         // System.out.println("dummy is "+ dummy.val);
         return dummy;
    }
        
    public int BFS(TreeNode root){
        queue.clear();
        queue.addLast(root);
        int num = 0;
        while(!queue.isEmpty()){
            if(queue.peekFirst().left != null) queue.addLast(queue.peekFirst().left);
            if(queue.peekFirst().right != null) queue.addLast(queue.peekFirst().right);
            queue.removeFirst();
             num++;
        }
       
        return num;
    }

 
    }

