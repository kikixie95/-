class Solution {
    public int heightChecker(int[] heights) {
        int[] sort = heights.clone();
        Arrays.sort(sort);
        int num = 0;
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != sort[i]){
                num++;
            }
        }
        return num;
    }
}