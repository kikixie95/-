class MinStack {

    ArrayDeque<Integer> stack = new ArrayDeque<>();
    int min = Integer.MAX_VALUE;
    
    /** initialize your data structure here. */
    public MinStack() {
        
    }
    
    public void push(int x) {
        if(x <= min){
            stack.addLast(min);
            min = x;
        }
        stack.addLast(x);
    }
    
    public void pop() {
        if(stack.removeLast() == min) 
            min = stack.removeLast();
    }
    
    public int top() {
        return stack.peekLast();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */