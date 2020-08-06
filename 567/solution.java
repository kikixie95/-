class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr1 = new int[26];
        int []arr2  = new int[26];
        
        for(char c : s1.toCharArray()){
            arr1[c-'a']++;
        }
        
        for( int i = 0; i < s2.length();  i++){
            arr2[s2.charAt(i)-'a'] ++;
            if(i>=s1.length()){
                char c = s2.charAt(i-s1.length());
                arr2[c-'a']--;
            }
            if(helper(arr1,arr2)){
                return true;
            }
        }
        return false;
    }
    public boolean helper(int[]a, int[]b){
        for(int i = 0; i < a.length; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}