class Solution {
    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        int len =  s.length();
        StringBuilder[] sb = new StringBuilder[numRows];
        
        for(int i = 0; i < numRows; i++){
            sb[i] = new StringBuilder();
        }
        int i = 0;
        while(i<len){
            for(int index = 0; index < sb.length && i<len; index++){
                sb[index].append(chars[i++]);
            }
            for(int index = numRows-2; index>=1 && i<len; index--){
                sb[index].append(chars[i++]);
            }
        }
        
        for(int j = 1; j < sb.length; j++){
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }
}