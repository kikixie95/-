class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        // List<List<String>> res = new ArrayList<>();
        HashMap<String,ArrayList<String>>map = new HashMap();
        char c = 'a';
        
        for(String s : strings){
            String d = "";
            for(int i = 0; i < s.length(); i++){
                c = s.charAt(i);
                d += (c+26-s.charAt(0))%26;
            }
            if(!map.containsKey(d)){
                map.put(d,new ArrayList<String>());
            }
          ArrayList<String> tmp = map.get(d);
              tmp.add(s);
            map.put(d,tmp);
        }
        List<List<String>> res = new ArrayList<>(map.values());
        return res;
    }
}