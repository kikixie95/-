

class ValidWordAbbr {

    String[] dict;
    public ValidWordAbbr(String[] dictionary) {
       this.dict = dictionary;
    }

    public boolean isUnique(String word) {
        int len = word.length();
       for(String s : this.dict){
           if(word.equals(s)){
               continue;
           }
           if(s.length() == len && word.charAt(0) == s.charAt(0) && word.charAt(len-1) == s.charAt(s.length()-1)) return false;
       }
        return true;
    }
    
}

/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */

