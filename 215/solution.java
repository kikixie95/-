// heap
class Solution {
    public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)-> a-b);
       for(int n : nums){
           heap.add(n);
          
           if(heap.size()>k){
               heap.poll();
           }
       }
        
        return heap.poll();
    }
}

// sort
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}