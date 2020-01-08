class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
       
        int tmp;
       
//         int i = intervals.length -1;
//         while(i > 0){
//             int j = intervals.length -1;
//         while(j > 0){       
//           if(intervals[i][1] <= intervals[j-1][1] && j > 0){
//               tmp = intervals[i-1][1];
//               intervals[j-1][1] = intervals[i][1];
//               intervals[i][1] = tmp;
              
//               tmp =  intervals[i-1][0];
//               intervals[j-1][0] = intervals[i][0];
//               intervals[i][0] = tmp;
//               j--;
//           }
//         }
//             i--;
//         }
        
        
        Arrays.sort(intervals,(int[] m, int n[]) -> m[1]-n[1]);
    
        for(int k = 0; k < intervals.length-1; k ++){
            if(intervals[k][1] >intervals[k+1][0]) return false;
        }
            return true;
        }
    }
