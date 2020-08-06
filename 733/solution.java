class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] ==  newColor) return image;
        helper(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    
    public void helper(int[][] image,int row,int col,int newColor,int oldColor){
        if(row < 0||row >=image.length||col < 0||col >= image[0].length||image[row][col]!= oldColor){
            return;
        }
        
       
        image[row][col]  = newColor;
        
        helper(image,row,col+1,newColor,oldColor);
        helper(image,row,col-1,newColor,oldColor);
        helper(image,row+1,col,newColor,oldColor);
        helper(image,row-1,col,newColor,oldColor);
    }
}