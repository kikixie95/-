class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : words){
            sb.append(new StringBuilder(str).reverse().toString());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}