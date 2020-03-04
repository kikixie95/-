class Solution {
    public int totalFruit(int[] tree) {
        int max = 0;
        int start = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tree.length; i++){
             map.put(tree[i], map.getOrDefault(tree[i],0)+1);
            while(map.size()>2){
                map.put(tree[start],map.get(tree[start])-1);
                if(map.get(tree[start]) == 0){
                    map.remove(tree[start]);
                }
                start++;
            }
           max = Math.max(max, i-start+1);
        }
            
        
        return max;
    }
}