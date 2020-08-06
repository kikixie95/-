class TrieNode{

    TrieNode[] children = new TrieNode[26];
    boolean isWord;
   public TrieNode(){
       
   }
}
class WordDictionary {
TrieNode root;
    /** Initialize your data structure here. */
    public WordDictionary() {
       root = new TrieNode();
    }
    
    /** Adds a word into the data structure. */
    public void addWord(String word) {
        TrieNode cur = root;
        for(char c : word.toCharArray()){
            if(cur.children[c-'a'] == null){
                cur.children[c-'a'] = new TrieNode();
            }
            cur = cur.children[c-'a'];
        }
        cur.isWord = true;
    }
    
    /** Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter. */
    public boolean search(String word) {
        return helper(word.toCharArray(),0,root);
    }
    public boolean helper(char[] chars,int k, TrieNode node){
        if(k == chars.length){
            return node.isWord;
        }
        
        if(chars[k] == '.'){
            for(int i = 0; i < node.children.length; i++){
                if(node.children[i] != null && helper(chars,k+1,node.children[i])){
                    return true;
                }
            }
        }else{
            return node.children[chars[k]-'a']!=null && helper(chars,k+1,node.children[chars[k]-'a']);
        }
        
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */