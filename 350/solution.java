class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //sort array
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0, j = 0, m = 0;
      int  len1 = nums1.length;
       int len2 = nums2.length;
        
        while(i < len1 && j < len2){
            if(nums1[i] == nums2[j]){ 
                nums1[m] = nums1[i];
                m++;
                i++;
                j++;
                
            }else if(nums1[i] <nums2[j] ){
                i++;
            }else{
                j++;
            }
        }
        
     return Arrays.copyOfRange(nums1, 0, m);  
    }
}