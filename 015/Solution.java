class Solution {
    List<List<Integer>> res = new ArrayList<>(); 
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length == 0) return new ArrayList<>(); 
        helper(nums,new ArrayList<Integer>(),0);
        return res;
        
    }
    public void helper(int[] nums, ArrayList<Integer> arr, int index){
     
        if(arr.size() == 3 && (arr.get(0)+arr.get(1)+arr.get(2))== 0) {
                res.add((ArrayList<Integer>)arr.clone());
            }
           
        if(arr.size()==3 &&(arr.get(0)+arr.get(1)+arr.get(2))!= 0 ) return;
        
         for(int i = index; i < nums.length; i ++){
            if(arr.size()<3){
            arr.add(nums[i]);
            helper(nums,arr,i+1);
            System.out.println(arr);
            arr.remove(arr.size()-1);
            }
        }
    }
}

// accepted

class Solution {
    List<List<Integer>> res = new ArrayList<>(); 
    public List<List<Integer>> threeSum(int[] nums) {
       
        if(nums.length == 0) return new ArrayList<>(); 
         Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-2; i ++){   
            if(i == 0 || (i > 0 && nums[i-1] != nums[i])){
             int slow = i+1, fast = nums.length-1, sum = 0-nums[i];
            while(slow < fast){
                if(nums[slow] + nums[fast] == sum){
                   ArrayList<Integer> arr = new ArrayList<>();
                     arr.add(nums[i]);
                      arr.add(nums[slow]);
                      arr.add(nums[fast]);
                      res.add(arr);
                    while(slow<fast &&  nums[slow] == nums[slow+1])  slow++;
                    while(slow<fast &&  nums[fast] == nums[fast-1])   fast--;
                    slow++;
                    fast--;
                }
                else if(nums[slow]+nums[fast] <sum) slow++;
                else fast--;
                
            }
            }
       
      }
        return res;
        
    }

    
 }
