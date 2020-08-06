class Solution {
    public int[] numMovesStones(int a, int b, int c) {
       int[] stones = new int[]{a,b,c};
        int[]res = new int[2];
        Arrays.sort(stones);
        if(stones[2]-stones[0] == 2) return new int[]{0,0};
        
        if(Math.min(stones[2]-stones[1],stones[1]-stones[0]) <= 2){
            res[0] = 1;
        }else{
            res[0] = 2;
        }
        res[1] = stones[2]-stones[0]-2;
        return res;
    }
}