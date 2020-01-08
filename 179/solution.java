class Solution {
    public String largestNumber(int[] nums) {
        int sum = 0;
        for(int digit : nums){
            sum += digit;
        }
        if(sum == 0) return "0";
        String[] n = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            n[i] = nums[i]+"";
        }
        Arrays.sort(n, (a,b)->(b+a).compareTo((a+b)));
        StringBuilder build = new StringBuilder();
        for(String x: n) {
          
            build.append(x+"");
        }
       
        return build.toString();
    }
}