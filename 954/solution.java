class Solution {
   public boolean canReorderDoubled(int[] A) {
        Map<Integer,Integer> map = new TreeMap();
       for(int a : A){
           map.put(a,map.getOrDefault(a,0)+1);
       }
       for(int key: map.keySet()){
           if(map.get(key) == 0)continue;
           int pair = 0;
           if(key<0){
               pair = key/2;
           }else{
               pair = key*2;
           }
           if(key<0 && key%2!=0 ||map.getOrDefault(pair,0)<map.get(key)){
               return false;
           }
           map.put(pair,map.get(pair)-map.get(key));
       }
       return true;
    }
}

