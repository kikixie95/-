class Solution {
    public int[] shortestToChar(String S, char C) {
      int[] res = new int[S.length()];
       int start = 0;
        for(int i = 0; i < S.length();i++){
            if(S.charAt(i) == C){
                res[i] = 0;
                while(start < i){
                    res[start] = i-start; 
                    start++;
                }
                start = i+1;
            } 
        }
        start =  S.length()-1;
        for(int i = S.length()-1; i >= 0; i--){
             if(S.charAt(i) == C){
                while(start > i){
                    if(res[start] == 0)
                     res[start] = start - i; 
                    else res[start] = Math.min(res[start],start - i);
                    start--;
               }
                 start = i-1;
           } 
    }
        return res;
}
}