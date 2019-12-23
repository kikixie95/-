
public class ZigzagIterator {
    Iterator it;
    Deque<Integer> queue;
    int i;
 
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        
       queue = new ArrayDeque<>();
        
        while(!v1.isEmpty() && !v2.isEmpty()){
            queue.addLast(v1.get(0));
            v1.remove(0);
            queue.addLast(v2.get(0));
            v2.remove(0);
        }
        while(!v1.isEmpty()){
            queue.addLast(v1.get(0));
            v1.remove(0);
        }
         while(!v2.isEmpty()){
            queue.addLast(v2.get(0));
               v2.remove(0);
        }
       
        it = queue.iterator();
    }

    public int next() {
        if(it.hasNext()){
            i =(int)it.next();
          
        }
          return i;
       
    }
    public boolean hasNext() {
        return it.hasNext();
    }
    
}

/**
 * Your ZigzagIterator object will be instantiated and called as such:
 * ZigzagIterator i = new ZigzagIterator(v1, v2);
 * while (i.hasNext()) v[f()] = i.next();
 */