class Solution {
    boolean[] visited;
    int count;
    public int countArrangement(int N) {
        visited = new boolean[N+1];
        count = 0;
        helper(N,1);
        return count;
    }
    public void helper(int N, int idx){
        if(idx > N){
            count++;
        }
        for(int i = 1; i <= N; i++){
            if(!visited[i]&& (idx % i==0|| i%idx==0)){
                visited[i] = true;
                helper(N,idx+1);
                visited[i] = false;
            }
        }
    }
}