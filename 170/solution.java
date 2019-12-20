// two pointers
class TwoSum {
    public ArrayList<Integer> nums;
    /** Initialize your data structure here. */
    public TwoSum() {
        this.nums = new ArrayList<Integer>();
    }
    
    /** Add the number to an internal data structure.. */
    public void add(int number) {
        nums.add(number);
    }
    
    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        Collections.sort(nums);
        int left = 0, right = nums.size()-1;
        while(left < right){
            int result = nums.get(left) + nums.get(right);
            if(value == result){
                return true;
            }
            else if(value < result){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
        
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */