class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        int x,y;
        for(int i = 1; i < points.length; i++){
            x = Math.abs(points[i][0]-points[i-1][0]);
            y = Math.abs(points[i][1]-points[i-1][1]);
            res += Math.max(x,y);
        }
        return res;
    }
}