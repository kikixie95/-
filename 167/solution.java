//hashmap
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
        int result = target - numbers[i];
            if(map.get(result) != null){
                return new int[]{map.get(result)+1, i+1};
            }
            map.put(numbers[i],i);
        }
        return null;
    }
}

//two pointers
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int left = 0, right = numbers.length - 1;
    
    while(left < right){
        if (numbers[left] + numbers[right] == target){
           break;
        }
       else if(numbers[left] +numbers[right] > target){
            right--;
        }
        else{
            left++;
        }
    }
        
         return new int[]{left+1, right+1};
        
    }
}