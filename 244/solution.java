class WordDistance {
HashMap<String ,ArrayList<Integer>> map;
    ArrayList<Integer> arr;
    public WordDistance(String[] words) {
        map = new HashMap();
        for(int i = 0; i < words.length; i++){
            if(!map.containsKey(words[i])){
                 arr= new ArrayList(); 
            }else{
                arr = map.get(words[i]);
            }
            arr.add(i);
            map.put(words[i],arr);
        }
    }
    
    public int shortest(String word1, String word2) {
        ArrayList<Integer> a1 = map.get(word1);
         ArrayList<Integer> a2 = map.get(word2);
        int m = 0, n =0, min = Integer.MAX_VALUE;
        while(m < a1.size() && n < a2.size()){
             min = Math.min(min,Math.abs(a1.get(m) -a2.get(n)));
            if(a1.get(m) < a2.get(n)) m++;
            else n++;
        }
        return min;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */