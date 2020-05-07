class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length, mid = 0;
        while(left < right){
            mid = (left + right)>>>1;
            if(letters[mid]<= target){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return letters[left % letters.length];
    }
}