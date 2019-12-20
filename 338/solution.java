//use built in function
class Solution {
    public int[] countBits(int num) {
        int[] count = new int[num+1];
        int i = 0;
        while (i <= num){
            count[i] = Integer.bitCount(i);
            i++;
        }
        return count;  
    }
}

// did not use bit built in function
class Solution {
    public int[] countBits(int num) {
        int count = 4;
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(1);
        result.add(1);
        result.add(2);
        
        while (true){
            for(int i = 0; i < count; i++){
                result.add(result.get(i) + 1);
            }
            
            if(count > num)
                break;
            count = count * 2;
        }
        
        int[] res_array = new int[num+1];
        
        for(int  i=0; i<num+1; i++)
            res_array[i] = result.get(i);
        
        return res_array;
    }
}