class Solution {
    public String smallestSubsequence(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> visited =new  HashSet<>();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i < text.length(); i++){
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i),0)+1);
        }
     
        for(int i = 0; i < text.length(); i++ ){
            if(visited.contains(text.charAt(i))){
              map.put(text.charAt(i),map.get(text.charAt(i))-1);
                continue;
            }
            
            while(!stack.isEmpty() && text.charAt(i) < stack.peekLast() && map.get(stack.peekLast())>0){
                visited.remove(stack.peekLast());
                stack.removeLast();
               
            }
            
            stack.addLast(text.charAt(i));
            visited.add(text.charAt(i));
            map.put(text.charAt(i),map.get(text.charAt(i))-1);
        }
        
        String res = "";
        while(!stack.isEmpty()){
            res += stack.removeFirst();
        }
        return res;
    }
}