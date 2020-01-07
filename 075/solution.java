class Solution {
    public void sortColors(int[] nums) {
        int[] record = new int[3];
        for(int i = 0; i < nums.length; i++){
            record[nums[i]]++;
        }
        int index = 0;
      for(int i = 0; i < record.length; i++){
            while(record[i]>0){
                nums[index] = i;
                index++;
                record[i]--;
            }
        }
        
    }
}
