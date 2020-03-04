class Solution {
    public int[][] highFive(int[][] items) {
    HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        
        for(int i = 0; i < items.length; i++){
            if(!map.containsKey(items[i][0])){
                PriorityQueue<Integer> heap = new PriorityQueue<>();
                heap.add(items[i][1]);
                map.put(items[i][0],heap);
            }else{
                PriorityQueue<Integer> tmp = map.get(items[i][0]);
                tmp.add(items[i][1]);
                if(tmp.size()>5){
                    tmp.poll();
                }
                map.put(items[i][0],tmp);
            }
           
        }
        
        
        int[][] res = new int[map.size()][2];
        int idx = 0;
        for(Map.Entry<Integer, PriorityQueue<Integer>> entryset : map.entrySet()){
            res[idx][0] = entryset.getKey();
            int sum = 0;
            int size = entryset.getValue().size();
            while(entryset.getValue().size() >0){
                sum += entryset.getValue().poll();
                }
            sum /=size;
            res[idx][1] = sum;
            idx++;
        }
        return res;
    }
}