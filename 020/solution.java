class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>(){{
            put('(',')');
            put('{','}');
            put('[',']');
        }};
        ArrayDeque<Character> stack =new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++){
          
              if(map.containsKey(s.charAt(i))){
                  stack.addLast(s.charAt(i));      
              }
               if(stack.isEmpty()) return false;
              if(map.containsValue(s.charAt(i))){
                  if(map.get(stack.removeLast()) != s.charAt(i))
                      return false;
              }
           
         
        }
        if(!stack.isEmpty()) return false;
        else return true;
        
        
    }
}