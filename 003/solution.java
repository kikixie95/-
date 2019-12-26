//个人愚见

class Solution {
    public int lengthOfLongestSubstring(String s) {
       // HashSet<Character> set = new HashSet<>();
        int max_length = 0;
         int length = 0;
     
        if(s.length() == 1) return 1;
            
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> set = new HashSet<>();
            int pointer = i + 1;
            set.add(s.charAt(i));
            max_length = Math.max(max_length,length);
            while (pointer < s.length()){
                char curr = s.charAt(pointer);
                
                if(set.contains(curr)){
                    
                    length = set.size();
                     break;
                }
                else{
    
                     set.add(curr);
                     length = set.size();
                    pointer++;
                }
                
            }
        }
            return max_length;
    }
}


//亮亮的机智O(n)解法

class Solution {
    public int lengthOfLongestSubstring(String s) {
       // HashSet<Character> set = new HashSet<>();
        int max_length = 0;
        int length = 0;
     
        if(s.length() == 1) return 1;
        HashSet<Character> set = new HashSet<>();
        int tail = 0, head = 0;
         // set.add(s.charAt(head));
        
        for(; tail < s.length(); tail++){
            
            if(set.contains(s.charAt(tail))){
                while(true){
                    set.remove(s.charAt(head));
                    if(s.charAt(head) == s.charAt(tail))
                        break;
                    head ++;
                }
                head ++ ;
            }
            
            set.add(s.charAt(tail));
            max_length = Math.max(max_length, tail - head + 1);
            
        }
            return max_length;
    }
}
