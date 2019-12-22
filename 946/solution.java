class Solution {
    
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0 || popped.length == 0)
            return true;
        
        Deque<Integer> push = new ArrayDeque<>();
        Deque<Integer> pop = new ArrayDeque<>();
        Deque<Integer> result = new ArrayDeque<>();
        
        for(int i = 0; i < pushed.length; i++){
            push.addLast(pushed[i]);
            pop.addLast(popped[i]);
        }
        
        while(true){

            result.addLast(push.removeFirst());
            
            while(!result.isEmpty() && (result.peekLast().equals(pop.peekFirst()) )){
                
                pop.removeFirst();
                result.removeLast();
            }
            
            if(push.isEmpty()){
                
                break;
            }
        }
        
        return result.isEmpty();
        
   
    }
}