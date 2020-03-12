class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> ban = new HashSet<>();
        for(String s : banned){
            s=s.toLowerCase();
            ban.add(s);
        }
        
        
        HashMap<String,Integer> map = new HashMap<>();
        String[] str = paragraph.replaceAll("\\W"," ").split("\\s+");
        // System.out.println(str[4]);
        for(int i = 0; i < str.length; i++){
    map.put(str[i].toLowerCase(),map.getOrDefault(str[i].toLowerCase(),0) +1);
        }
        
        int value = 0;
        String res = "";
        for(Map.Entry<String, Integer> entryset : map.entrySet()){
           
            if(!ban.contains(entryset.getKey())){
                if(entryset.getValue() > value){
                 System.out.println(entryset.getKey());
                    value = entryset.getValue();
                    res = entryset.getKey();
                }
            }
        }
        return res;
    }
}