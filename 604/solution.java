class StringIterator {

    ArrayDeque<Object> queue;
    char prev;
    int num;
    
    public StringIterator(String compressedString) {
       
        this.queue = new ArrayDeque<>();
        int i = 0;
        
        while(i < compressedString.length()){
            
            if(Character.isDigit(compressedString.charAt(i))){
                // System.out.println(i);
                int count = 0;
                while(i < compressedString.length() && Character.isDigit(compressedString.charAt(i))){
                    count = 10*count + (compressedString.charAt(i) - '0');
                    i++;
                }
                queue.addLast(count);
                }
            else{
                queue.add(compressedString.charAt(i));
                i ++ ;
            }
                    
        }
        
        // System.out.println(queue);
    }

    
    public char next() {
        
        if(this.hasNext() || this.num != 0 ){

            if(this.num == 0){
                this.prev = (char)queue.removeFirst();
                this.num = (int)queue.removeFirst();
            }
            
            this.num -= 1;
            return this.prev;
        }else
            return ' ';
    }
    
    
    public boolean hasNext() {
      return  !queue.isEmpty() || this.num != 0;
        
    }
}

/**
 * Your StringIterator object will be instantiated and called as such:
 * StringIterator obj = new StringIterator(compressedString);
 * char param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */