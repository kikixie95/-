class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> res = new ArrayList<>();
        HashMap<String, List> map = new HashMap<>();
        String[] str = new String[strs.length];
        
        for(int i = 0; i < strs.length; i++){
            str[i] = sortStr(strs[i]);
            String key = str[i];
            if(!map.containsKey(key)){
                map.put(key, new ArrayList());
            }
                map.get(key).add(strs[i]);
        }
        
        res = new ArrayList(map.values());
        return res;
    }
    
    
    public String sortStr(String s){
        char tmp[] = s.toCharArray();
        Arrays.sort(tmp);
        return new String(tmp);
    }
}