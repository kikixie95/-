class MyCircularDeque {
    int[]arr;
    int head;
    int tail;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.arr = new int[k+1];
        this.head = 0;
        this.tail = head;  
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(!isFull()){
            head = (head + arr.length -1) % arr.length;
            this.arr[head] = value;
            return true;
        }
        else{
            return false;
        }
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(!isFull()){
            arr[tail] = value; 
            this.tail = (tail+1) % arr.length;
            
            
            return true;
        }
        else{
            return false;
        }
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(!isEmpty()){
            this.arr[head] = -1;
            this.head = (head + 1) % arr.length;
            return true;
        }
        else{
            return false;
        }
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(!isEmpty()){
            tail = (tail + arr.length -1) % arr.length;
            this.arr[tail] = -1;
          
            return true;
        }
        else{
            return false;
        }
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(!isEmpty()) return this.arr[head];
        else return -1;
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(!isEmpty())
        return this.arr[(tail+arr.length-1) % arr.length];
        else return -1;
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(this.head == this.tail){
            return true;
        }
        else return false;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if((this.tail+1 ) % (arr.length) == this.head){
            return true;
        }
        else return false;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */