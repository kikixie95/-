class Solution {
     List<String>res = new ArrayList();
    public List<String> letterCasePermutation(String S) {
        helper(S,0,new char[S.length()]);
        return res;
    }
    public void helper(String S, int start, char[] arr){
        if(start == S.length()){
            res.add(new String(arr));
            return;
        }
        arr[start] = S.charAt(start);
        helper(S,start+1,arr);
        if(Character.isLetter(S.charAt(start))){
            arr[start] = (char)(S.charAt(start)^(1<<5));
            helper(S,start+1,arr);
        }
        
    }
}