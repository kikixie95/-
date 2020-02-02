class Solution {
    class Couple{
        int col;
        int row;

        public Couple( int row, int col){
            this.col = col;
            this.row = row;
      
        }
    }
    public int[][] kClosest(int[][] points, int K) {
        int[][] res =  new int [K][2];
        PriorityQueue<Couple> heap = new PriorityQueue<>((Couple a, Couple b)-> {
            return euclidean(a.row,a.col)-euclidean(b.row,b.col);
        });
        int column = points[0].length;
        int times = 0;
        int prev = -1;
        for(int i = 0; i < points.length; i++){
                heap.add(new Couple(points[i][0],points[i][1]));
           
        }
     
        while(times <K){
          int eu =euclidean(heap.peek().row, heap.peek().col);
          prev = eu;
          res[times][0] = heap.peek().row;
          res[times][1] = heap.poll().col;
          times++;
        }
 
        return res;
    }
    
    
    public int euclidean(int row, int col){
        int ans =row*row + col*col;
        return ans;
    }
}