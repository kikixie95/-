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