
class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> heap = new PriorityQueue();
        HashSet<Long> set = new HashSet();
        
        heap.add(1L);
        set.add(1L);
        int[]prime = new int[]{2,3,5};
        int[]res = new int[1690];
        long cur = 0, num = 0;
        
       for(int i = 0; i < res.length; i++){
            cur = heap.poll();
           res[i] = (int)cur;
            for(int j : prime){
                num = cur * j;
                if(!set.contains(num)){
                    set.add(num);
                    heap.add(num);
                }
              
               
            }
            
        }
        return res[n-1];
        
    }
}