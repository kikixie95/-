class Solution {
    HashMap<Integer,String> map = new HashMap<>(){
        {
    put(2,"abc");
    put(3,"def");
    put(4,"ghi");
    put(5,"jkl"); 
    put(6,"mno");
    put(7,"pqrs");
    put(8,"tuv");
    put(9,"wxyz");
    
        }
    };
 
    ArrayList<String> res = new ArrayList<>();
    
    public List<String> letterCombinations(String digits) {
    
        if(digits.length() != 0) helper("",digits);
        return res;

    }
    
    public void helper(String ans, String digits){
        if(digits.length() == 0 ) {
            res.add(ans);
            }
        
        else{
            
           String letters = map.get(Integer.parseInt(digits.substring(0,1)));
            
            for(int i = 0; i < letters.length(); i++){
                
                String letter = letters.substring(i,i+1);
                
                helper(ans+letter, digits.substring(1));
                
                }
            }
        }
}
    
