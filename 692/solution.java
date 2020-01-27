class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String s : words){
            if(!map.containsKey(s)){
                map.put(s,1);
            }else{
                map.put(s, map.get(s) +1);
            }
        }
       
        
       Queue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(
           (a,b) -> {
            if(a.getValue() != b.getValue()) {return a.getValue() -b.getValue();}
            else {return b.getKey().compareTo(a.getKey());}
               
        });
      
        for (Map.Entry<String, Integer> entry :map.entrySet()) {
           queue.add(entry);
            if(queue.size()>k){
                queue.remove();
            }
        }

      System.out.println(queue);
        
        List<String> res = new ArrayList<>();
        while(!queue.isEmpty()){
          res.add(queue.poll().getKey());
        
        }
        Collections.reverse(res);
        return res;
    }
}