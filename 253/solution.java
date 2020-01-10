class Solution {
    public int minMeetingRooms(int[][] intervals) {
       //initiate two heaps
        Queue<Integer> s = new PriorityQueue<>(), e = new PriorityQueue<>();
       int num_room = 0, max = 0;
        // put array elements into heaps
        for(int[]interval : intervals){
            s.add(interval[0]);
            e.add(interval[1]);
            
        }
        
        while( !s.isEmpty()){
            if(s.peek() < e.peek()){
               num_room ++; 
                s.poll();
            }else{
                num_room --;
                e.poll();
            }
            max = Math.max(max, num_room);
        }
        return max;
    }
}