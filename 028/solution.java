class Solution {
  public int strStr(String haystack, String needle) {
      
        int len = haystack.length(), l = needle.length();
        
        for(int i = 0; i < len-l+1; i++){
            if(haystack.substring(i,i+l).equals(needle)){
                
               return i;
            }
            }
      return -1;
  }
}