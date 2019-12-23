class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        HashSet<String> set = new HashSet<>();
        set.add("+");
        set.add("-");
        set.add("*");
        set.add("/");
        
        for(String s : tokens){
            
            if(!set.contains(s)){
                stack.addLast(Integer.valueOf(s));
            }
            else{
                int temp = operator(s,stack.removeLast(),stack.removeLast());
                stack.addLast(temp);
            }
            
        }
        return stack.removeLast();
        
    }
    
    public int operator(String m,int b,int a){
        switch(m){
            case "+":
                return a+b;
              
            case "-":
                return a-b;
               
            case "*":
                return a*b;
              
            case "/":
                return a/b;
               
            default:
                return 0;
                    
        }
        
    }
}