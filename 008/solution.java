

class Solution {
    public int myAtoi(String str) {
        int i = 0, sign = 1, res = 0;
        
      //remove whitespace
        str = str.trim();
        
        if(str.length() == 0) return 0;
        
    // sign
        if(str.charAt(i) == '-' || str.charAt(i) == '+'){
            if(str.charAt(i) == '-')  sign = -1;
            else sign  = 1;
           
            i++;
        }
        
    // convert string to number
        while(i < str.length()){
            int num = 0;
            if(!Character.isDigit(str.charAt(i))) break;
            else{
               num  = str.charAt(i) - '0';
               
            }
            
            //overflow
            if((res > Integer.MAX_VALUE/10) || (res >= Integer.MAX_VALUE/10 && num > 7)){
                // System.out.println(res);
                // System.out.println(sign);
                 
                if(sign == 1) return Integer.MAX_VALUE;
                if(sign == -1) return Integer.MIN_VALUE;
                
            }
            
            res = res * 10 + num;
            i ++;
        }
    
        return res * sign;
    }
}