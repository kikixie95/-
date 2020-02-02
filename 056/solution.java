class Solution {
    
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        
       Arrays.sort(intervals,new Comparator<int[]> () {
            public int compare(final int[] a, final int[] b){
                return Integer.compare(a[0], b[0]);
            }
       } );
            
       
     int index = 0;
         // System.out.print(start+"   "+end);
        for(int[] interval : intervals){
            if(interval[0] >= intervals[index][0] && interval[0] <= intervals[index][1] ) {
                intervals[index][0] = Math.min(interval[0],intervals[index][0]);
               intervals[index][1] = Math.max(interval[1],intervals[index][1]);
            }
           else{
              index++;
               intervals[index][0] = interval[0];
            intervals[index][1]=interval[1];
           }
        }
        
       
        return Arrays.copyOf(intervals, index+1); 
        }
    }
