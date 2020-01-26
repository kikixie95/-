class TimeMap {
 
    class KeyTime{
        String value;
        int timestamp;

       public  KeyTime(String value, int timestamp){
           this.value = value;
           this.timestamp = timestamp;
       }
        
    }

    HashMap<String, ArrayList<KeyTime>> map;
    /** Initialize your data structure here. */
    public TimeMap() {
       map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<KeyTime>());
        }
        
        (map.get(key)).add(new KeyTime(value,timestamp));
        
    }
    
    public String get(String key, int timestamp) {
      if(!map.containsKey(key)){
          return "";
      }
      else{
          ArrayList<KeyTime> arr = map.get(key);
          int low = 0;
          int high = arr.size()-1;
          
          while (low <= high){
            int mid = low + ((high-low) >> 1);
            if(arr.get(mid).timestamp > timestamp)  high = mid -1;
            else{    
             if(mid == arr.size()-1 ||timestamp < arr.get(mid+1).timestamp)                     
               return arr.get(mid).value;
             else{
               low = mid+1;
                 } 
                }
          }
          return "";
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */