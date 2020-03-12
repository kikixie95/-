class Solution {
    public int compress(char[] chars) {
        int ans = 0, index = 0;
        while(index < chars.length){
            char cur = chars[index];
            int count = 0;
            
            while(index < chars.length && chars[index] == cur){
                count++;
                index++;
            }
            
            chars[ans++]  =  cur;
            if(count != 1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }
}