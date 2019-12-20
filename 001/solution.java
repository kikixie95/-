//bruce force

class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        for(int i = 0; i < nums.length-1; i++){
            
            for(int j = i+1; j < nums.length; j++){
                
                if(nums[i] + nums[j] == target){
                    int[] result = {i,j};
                    return result;
                }
            }
        
        }
        return null;
    }
}

//hashmap two-pass
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int j = 0; j < nums.length; j++){
            map.put(nums[j],j);
        }
        int i = 0;
        while( i < nums.length){
            int result = target - nums[i];
            if(map.get(result) != null && map.get(result) != i){
                return new int[]{i, map.get(result)};
            }
            i++;
        }
        
        return null;
      
    }
}

//hashmap one pass
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int result = target-nums[i];
            if(map.get(result) != null){
                return new int[]{map.get(result),i};
            }
            map.put(nums[i],i);
        }
        
        return null;
      
    }
}