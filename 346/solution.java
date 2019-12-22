//O(n)
class MovingAverage {
    int size;
    Deque<Integer> queue;
    
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
        Deque<Integer> queue = new LinkedList<>();
        this.queue = queue;
    }
    
    public double next(int val) {
        
        if (this.queue.size() == this.size)
            this.queue.poll();
        
        this.queue.add(val);
        double sum = 0;
    
        Iterator it = this.queue.iterator();
        while(it.hasNext()){
            sum += (int)it.next();
        }
        
        return sum/this.queue.size();
       
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */


//O(1)

class MovingAverage {
    int size;
    double sum = 0;
    Deque<Integer> queue;
    
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
        Deque<Integer> queue = new LinkedList<>();
        this.queue = queue;
    }
    
    public double next(int val) {
        
        if (this.queue.size() == this.size)
           sum -= this.queue.poll();
        
        sum+=val;
        this.queue.add(val);
            
        return sum/this.queue.size();
       
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */