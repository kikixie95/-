class MyStack {
    Deque<Integer> stack;
    
    /** Initialize your data structure here. */
    public MyStack() {
         this.stack = new LinkedList<>();
        
    }

    /** Push element x onto stack. */
    public void push(int x) {
         this.stack.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        
         Deque<Integer> tmp = new LinkedList<>();
         int size = stack.size();
        
         for(int i = 0; i < size - 1; i++){
             
             tmp.add(stack.poll());
         }
         
         int pop = stack.poll();

         for(int j = 0; j < size-1 ; j++){
             
            stack.add(tmp.poll());
         }
        
        return pop;
    }
    
    /** Get the top element. */
    public int top() {
        
        Deque<Integer> tmp2 = new LinkedList<>();
        int size = this.stack.size();
        
        for(int i = 0; i < size-1; i++){
             tmp2.add(this.stack.poll());
         }
        
        int top = stack.poll();

        for(int j = 0; j < size-1; j++){

            this.stack.add(tmp2.poll());
            
        }
        
        stack.add(top);
        
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        
        return this.stack.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */