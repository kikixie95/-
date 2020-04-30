class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //sort people's height in descending order, and k-value in ascending order
        Arrays.sort(people,(int[]a,  int[]b)->{
            if(a[0]!=b[0]){
                return b[0]-a[0];
            }else{
                return a[1]-b[1];
            }
        });
    
        ArrayList<int[]> res = new ArrayList();
        for(int[] n : people){
            res.add(n[1],n);
        }
        return res.toArray(new int[people.length][2]);
        
    }
}