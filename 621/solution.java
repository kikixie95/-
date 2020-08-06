class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] ntasks = new int[26];
        for(char task:tasks){
            ntasks[task-'A']++;
        }
        Arrays.sort(ntasks);
        int i = ntasks.length-1, max = ntasks[25];
       while(i >= 0 && ntasks[i]==max){
           i--;
       }
        return Math.max((max-1)*(n+1)+25-i,tasks.length);
        
    }
}