class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb  = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] str= path.split("/");
       
        for(String s : str){
            if(s.length()<1) continue;
           else if(s.equals(".")) continue;
            else if(s.equals("..")) stack.pollFirst();
            else stack.addFirst(s);
        }
        if(stack.isEmpty()) return "/";
        
        while(!stack.isEmpty()){
            sb.append("/").append(stack.pollLast());
        }
        return sb.toString();
            
      
        
    }
}