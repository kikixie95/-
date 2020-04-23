class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap();
        if(s.length() == 0) return true;
        
        for(int i = 0; i < s.length(); i++){
            char a  = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                if(!map.get(a).equals(b))
                    return false;
            }else{
                if(map.containsValue(b)){
                    return false;
                }else{
                    map.put(a,b);
                }
            }
        }
        return true;
       
    }
}