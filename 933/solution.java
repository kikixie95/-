class RecentCounter {
    Deque<Integer> queue;
    // ArrayList<Integer> result;

    public RecentCounter() {
        this.queue = new LinkedList<>();
        // this.result = new ArrayList<>();
        
    }
    
    public int ping(int t) {
         queue.add(t);
      
        while(t-queue.peek()>3000){
            queue.poll();
        }
        
       
        int result = queue.size();
        return result ;
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */