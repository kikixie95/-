class Solution {
    
 public String longestCommonPrefix(String[] strs) {
     if(strs.length < 1) return "";
    String res = strs[0];
     for(int i = 0; i < strs.length; i++){
         while(strs[i].indexOf(res) != 0){
             res = res.substring(0,res.length()-1);
             if(res.length() == 0){
                 return "";
             }
         }
     }
     return res;
     
}
}