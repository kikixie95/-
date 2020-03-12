class Solution {
    public boolean validPalindrome(String s) {
       char[] chars = s.toCharArray();
        int left = 0, right = s.length()-1;
        while(left < right){
            if(chars[left] == chars[right]){
                left++;
                right--;
            }else{
                return check(Arrays.copyOfRange(chars,left+1,right+1)) || check(Arrays.copyOfRange(chars,left,right));
            }
        }
        return true;
        
    }
    public boolean check(char[] a){
        int left = 0, right = a.length-1;
       
            if(a[left] == a[right]){
               
                left++;
                right--;
            }else{
               
                return false;
             }  
          return true;
        }
      

}