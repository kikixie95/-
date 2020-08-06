class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList();
        if(n == 0) return res;
        helper(n,n,"");
        return res;
    }
    public void helper(int left, int right,String cur){
        if(left == 0 && right == 0){
            res.add(cur);
            return;
        }
        
        if(left > right){
            return;
        }
        if(left >0){
            helper(left-1,right,cur+"(");
        }
        if(right > 0){
            helper(left,right-1,cur+")");
        }
    }
}