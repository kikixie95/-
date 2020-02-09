//moore voting algo
class Solution {
    public int majorityElement(int[] nums) {
      int major = nums[0];
        int count = 0;
        for(int num = 1; num < nums.length; num++){
            if(nums[num] == major) count++;
            else if(count == 0 && nums[num] != major) {
                major = nums[num];
                count =0;
            }else count--;
            
            }
        return major;
    }
}

// hashmap
class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,0);
            }
            map.put(num,map.get(num)+1);
        }
    int maj = nums.length/2;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>maj){
                res = entry.getKey();
            }
        }
        return res;
    }
}