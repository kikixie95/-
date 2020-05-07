class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int result = Integer.MIN_VALUE,j = 0,n = heaters.length,cur = 0;
        for(int i = 0; i < houses.length; i++){
            cur = houses[i];
            while(j < n -1 && Math.abs(heaters[j+1] -cur) <= Math.abs(heaters[j] -cur))    j++;
            
            result = Math.max(result, Math.abs(heaters[j] -cur));
        }
        
       
        return result;
    }
}