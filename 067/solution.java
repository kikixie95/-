class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        while(i >= 0 || j >= 0 || carry != 0){
            int sum = carry;
            if(i>=0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j>=0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            carry = sum / 2;
            if(sum %2 == 0)sb.append('0');
            else sb.append('1');
        }
        return sb.reverse().toString();
    }
}