class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
 
        HashMap<Integer, Integer> map = new HashMap<>();
         for (int n: nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }
 PriorityQueue<Integer> heap =
            new PriorityQueue<Integer>((n1, n2) -> map.get(n1) - map.get(n2));
      
        for(int a : map.keySet()){
            heap.add(a);
            if(heap.size() > k){
                heap.remove();
            }
        }
        
        List<Integer> list = new ArrayList<>();
        while(!heap.isEmpty()){
            list.add(heap.poll());
        }
        
        Collections.reverse(list);
        return list;
     }
       
        
    }
