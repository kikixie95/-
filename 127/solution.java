//BFS
class Solution {
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
     HashSet<String> set = new HashSet<>();
        
       for(String s : wordList){
           set.add(s);
       }
        
        if(!set.contains(endWord)){
            return 0;
        }
        
    Deque<String> queue = new ArrayDeque<>();
        queue.addLast(beginWord);
        int l = beginWord.length();
        int step = 0;
    
   while(!queue.isEmpty()){
            step++;
      for(int s = queue.size(); s>0; s--){
                String tmp = queue.removeFirst();
                char[] arr = tmp.toCharArray();
       for(int i = 0; i < arr.length;i++){
                   char c = arr[i];
          
                    for(char j = 'a'; j <= 'z'; j++){
                           if(j == c) continue;
                        arr[i] = j;
           String newTmp = new String(arr);
                   
          if(newTmp.equals(endWord)) return step+1;
            if(!set.contains(newTmp)) continue;       
           queue.addLast(newTmp);
                        set.remove(newTmp);
                    }
                    arr[i] = c;
                }
            }
        }
    
        return 0;
    }
}

//bidirectional BFS

class Solution {
  public int ladderLength(String beginWord, String endWord, List<String> wordList) {
     HashSet<String> set = new HashSet<>();
        
       for(String s : wordList){
           set.add(s);
       }
        
        if(!set.contains(endWord)){
            return 0;
        }
    HashSet<String> set1 = new HashSet<>();
      set1.add(beginWord);
    HashSet<String> set2 = new HashSet<>();
      set2.add(endWord);
    
        int l = beginWord.length();
        int step = 0;
    
   while(!set1.isEmpty() && !set2.isEmpty()){
            step++;
      if(set1.size() > set2.size()){
          HashSet<String> tmp = set1;
          set1= set2;
          set2 = tmp;
      }
       
       HashSet<String> hs = new HashSet<>();
       for(String str : set1){
           char[] arr = str.toCharArray();
           for(int i = 0; i < l; i++){
               char c = arr[i];
               for(char j = 'a'; j <= 'z'; j++){
                   arr[i] = j;
                   String s = new String(arr);
                   if(set2.contains(s)) return step+1;
                   if(!set.contains(s)) continue;
                   hs.add(s);
                   set.remove(s);
               }
               arr[i] =  c;
           }
       }
            set1 = hs;    
            
        }
    
        return 0;
    }
}