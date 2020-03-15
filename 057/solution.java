class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        int i = 0;
        int x = newInterval[0], y = newInterval[1];
       
            
            // while(x<= intervals[i][1]){
               
            //     i++;
            // }
            
            while(i <  intervals.length && intervals[i][1] < x){
                stack.add(intervals[i]);
                i++;
            }
            
            while(i <  intervals.length && y >= intervals[i][0] ){
                 x = Math.min(x,intervals[i][0]);
                 y = Math.max(y,intervals[i][1]);
                i++;
            }
            newInterval[0] = x;
            newInterval[1] = y;
            stack.add(newInterval);
            
            while(i <  intervals.length){
                stack.add(intervals[i]);
                i++;
            }
            
       return stack.toArray(new int[stack.size()][2]);
    }
}