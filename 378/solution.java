//brute force
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
          int size = (matrix.length) * (matrix[0].length);
          int[] arr = new int[size];
          int index = 0;
        
        for(int i = 0; i < matrix.length; i++){
           for(int j = 0; j < matrix[0].length; j++){
               arr[index] = matrix[i][j];
               index++;
           } 
        }
        
        Arrays.sort(arr);
        return arr[k-1];
        
    }
}
//comparator
class Solution {
    class Number{
        int num;
        int col;
        int row;
        public Number(int num, int row, int col){
            this.num = num;
            this.col = col;
            this.row = row;
        }
    }
    
    class SortNumber implements Comparator<Number>{
    
        public int compare(Number n1, Number n2){
            return n1.num - n2.num;
        }
    }
    
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Number> heap =  new PriorityQueue<>(new SortNumber());
        
        for(int i = 0; i < matrix[0].length; i ++){

            Number node = new Number(matrix[0][i],0,i);
            heap.add(node);
        }
        
        int time = k-1;
        while(time-- > 0){
            
          Number min = heap.poll();
            if(min.row<matrix.length-1){
          Number newMin =new Number(matrix[min.row+1][min.col],min.row+1,min.col);
           heap.add(newMin);
            }
           
        }
        Number res = heap.poll();
        return res.num;
       
        
    }
}

// Comparable
class Solution {
    class Number implements Comparable<Number>{
        int num;
        int col;
        int row;
        public Number(int num, int row, int col){
            this.num = num;
            this.col = col;
            this.row = row;
        }
        public int compareTo(Number n){
            return this.num - n.num;
        }
    }
    

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Number> heap =  new PriorityQueue<>();
        
        for(int i = 0; i < matrix[0].length; i ++){

            Number node = new Number(matrix[0][i],0,i);
            heap.add(node);
        }
        
        int time = k-1;
        while(time-- > 0){
            
          Number min = heap.poll();
            if(min.row<matrix.length-1){
          Number newMin =new Number(matrix[min.row+1][min.col],min.row+1,min.col);
           heap.add(newMin);
            }
           
        }
        Number res = heap.poll();
        return res.num; 
    }
}

// niubi
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int left = matrix[0][0], right = matrix[matrix.length-1][matrix.length-1],mid = 0, count = 0;
        while(left < right){
            mid = (left+right)>>1;
            count = helper(matrix,mid);
            if(count < k){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        return left;
    }
    public int helper(int[][] matrix, int target){
        int n = matrix.length, i = n - 1, j = 0, res = 0;
        while(i >= 0 && j < n){
            if(matrix[i][j] <= target){
                res += i+1;
                j++;
            }else{
                i--;
            }
        }
        return res;
    }
}