class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> res = new ArrayList<>();
        
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                if(s.charAt(i) == '+') {
                    String nstr = s.substring(0,i) +"--" + s.substring(i+2);
                    res.add(nstr);
                }
            }
        }
        return res;
    }
}