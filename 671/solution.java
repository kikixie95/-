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
   
    public int findSecondMinimumValue(TreeNode root) {
       
        HashSet<Integer> set = new HashSet<>();
        Traverse(root,set); 
        int min = root.val;
        long max = Long.MAX_VALUE;
       
        for(int s : set){
            if(s > min && s < max ) {
                max = s;
            }
        }
        
        if(max >= Long.MAX_VALUE) return -1;
        else return (int)max;
            }
    public void Traverse(TreeNode node, HashSet<Integer> set){
        if(node != null){
         set.add(node.val);
         Traverse(node.left,set);
         Traverse(node.right,set); 
        }
    }
           
        }
    
