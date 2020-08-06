import java.math.BigInteger;
class Solution {
    
    public boolean isAdditiveNumber(String num) {
        if(num.length() < 3) return false;
        ArrayList<BigInteger> res = new ArrayList<>();
        return Backtrk(res,num);
            
    }
    public boolean Backtrk(ArrayList<BigInteger> res, String num){
        int size = res.size();
        if(res.size() >=3 &&!(res.get(size-2).add(res.get(size-3))).equals(res.get(size-1))  ){
            return false;
        }
        if(num.length() == 0 &&res.size()>=3) return true;
        
        for(int i  = 1; i < num.length()+1; i ++){
            String cur = num.substring(0,i);
            if(cur.startsWith("0") && cur.length() >1) continue;
            res.add(new BigInteger(cur));
            if(Backtrk(res,num.substring(i))) return true;
            res.remove(res.size()-1);
        }
        return false;
    }
}



class Solution {
    int n ;
    public boolean isAdditiveNumber(String num) {
       n = num.length();
        for(int i = 1; i <= n/2; i++){
            if(num.charAt(0) == '0' && i>1) return false;
            long first = Long.valueOf(num.substring(0,i));
            for(int j =1; Math.max(i,j) <= n-i-j; j++){
                if(num.charAt(i) == '0' && j > 1){
                    break;
                }
                long second = Long.valueOf(num.substring(i,i+j));
                if(isValid(first,second,i+j,num)) return true;
            }
        }
        return false;
    }
    public boolean isValid(long first, long second, int start,String num){
        if(start ==n ) return true;
        second = first+second;
        first = second-first;
        String sum = String.valueOf(second);
        return num.startsWith(sum,start) && isValid(first,second,start+sum.length(),num);
    }
}