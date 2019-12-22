class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        if(!wordList.contains(endWord)) return 0;
        
        Deque<String> queue = new ArrayDeque<>();
        queue.addLast(beginWord);
        int steps = 1;
        HashSet<String> set = new HashSet<>(wordList);
        HashSet<String> visited = new HashSet<>();
        visited.add(beginWord);
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            while(size != 0){
                String temp = queue.removeFirst();
                for(int i = 0 ; i < temp.length(); i++){
                    for( char c : chars ){
                        String newString = temp.substring(0,i) + c + temp.substring(i+1);
                        if(set.contains(newString) && !visited.contains(newString)){
                            if (newString.equals(endWord))
                                return steps + 1;
                            // System.out.println(newString);
                            queue.addLast(newString);
                            visited.add(newString);
                        }
                    }
                }
                size -= 1;            
            }
            steps += 1;
            
        }
        
        return 0;
        
    }
}