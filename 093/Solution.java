import java.util.Arrays;

class Solution {
    ArrayList<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        helper(s, new ArrayList<String>(),0);
        return res;
    
    }
    
    public boolean check_state(int num, int index,int i, String s){
       if((index+1 == i && s.charAt(index) == '0')  || num>255)
           return false;
           else  return true;
        
    }
    
    
    public void helper(String s, ArrayList<String> arr,int index){
        
        if(arr.size() == 4 && index == s.length()){
             StringBuilder sb = new StringBuilder();
                for(String S : arr){
                    sb.append(S).append(".");
                }
                sb.deleteCharAt( sb.length() - 1);
            res.add(sb.toString());

        }
        
        if(arr.size() == 4 || index == s.length())
            return ;
    
        int num = 0;

        for(int i = index; i < s.length(); i++){
            num = num*10 + s.charAt(i)-'0';

            if(!check_state(num, index, i, s))
                break;

            arr.add(String.valueOf(num));
            helper(s,arr,i+1);
            arr.remove(arr.size()-1);

        }
    }
}