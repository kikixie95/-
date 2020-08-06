class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
         String res = "";
        boolean positive = true;
        if(num < 0){
             num = -num;
            positive = false;
        }
        
        while(num > 0){
            res  = num%7+res;
            num = num/7;
        }
        if(!positive) res = "-"+res;
        return res;
    }
}