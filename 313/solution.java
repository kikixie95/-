class Solution {
    class Num implements Comparable<Num>{
        int val;
        int idx;
        int prime;
        public Num(int val, int idx, int prime){
            this.val = val;
            this.idx = idx;
            this.prime = prime;
        }
        public int compareTo(Num a){
            return this.val - a.val;
        }
    }
    public int nthSuperUglyNumber(int n, int[] primes) {
        ArrayList<Integer> list = new ArrayList();
        PriorityQueue<Num> heap = new PriorityQueue();
       for(int i = 0;  i < primes.length; i++){
             heap.add(new Num(primes[i],0,primes[i]));
       }
        list.add(1);
        int cur = 0;
        Num num = null;
      for(int i = 1; i < n; i++){
         cur = heap.peek().val;
          list.add(cur);
          while(cur == heap.peek().val){
              num = heap.poll();
              heap.add(new Num(num.prime * list.get(num.idx), num.idx+1,num.prime));
          }
      }
       
        return list.get(n-1);
    }
}