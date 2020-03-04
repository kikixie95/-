class Solution {
    public boolean validWordSquare(List<String> words) {
        if(words.size() == 0 ||words.size() != words.get(0).length()) return false;
      
       for(int i = 0; i < words.size(); i++){
        for(int j = 0; j < words.get(i).length(); j++){
            String s = words.get(i);
            if(j>=words.size()||words.get(j).length() <= i ||s.charAt(j) != words.get(j).charAt(i)){
                return false;
            }
        }
       }
        
        return true;
        
    }
}