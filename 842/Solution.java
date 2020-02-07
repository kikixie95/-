
class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
         ArrayList<Integer> tmp = new ArrayList<>();
        if(helper(tmp,0,S)) return tmp;
        else return new ArrayList<Integer>();
    }
    
    public boolean helper(ArrayList<Integer> tmp, int index, String s){
        if(index == s.length()){
            if(tmp.size() >= 3) return true;
            else return false;
        }
        
        int num = 0;
  
        for(int i = index; i < s.length(); i++){
            //skip number leading with 0
            if(num == 0 && i != index && s.charAt(i-1) == '0')
                break;
            
            num = num * 10 + (s.charAt(i)-'0');
            if(num < 0) 
                break;
            if(tmp.size() < 2|| num ==tmp.get(tmp.size()-1)+tmp.get(tmp.size()-2)){
                tmp.add(num);
                if(helper(tmp, i+1,s)) 
                    return true;
                else 
                    tmp.remove(tmp.size()-1);
            }
        }
        return false;
    }
}