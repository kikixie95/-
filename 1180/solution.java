class Solution {
     public int countLetters(String S) {
        if(S.length() < 1){
            return 0;
        }
        char prev = S.charAt(0);
         int count = 0, res = 0;
         for(int i = 0; i < S.length(); i ++){
             char c = S.charAt(i);
             if(c == prev){
                 count++;
             }else{
                 count = 1;
             }
             res += count;
             prev = c;
         }
         return res;
    }
}