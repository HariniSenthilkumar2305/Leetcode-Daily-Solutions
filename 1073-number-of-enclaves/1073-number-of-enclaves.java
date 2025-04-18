class Solution {
    public int numEnclaves(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i==0 || i==row-1 || j==0 || j==col-1) && grid[i][j]==1){
                     dfs(grid,i,j);
                }
            }
        }
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    count++;
                }  
            }
        }
        return count;
    }
    public static void dfs(int[][] grid,int i,int j){
        int row=grid.length;
        int col=grid[0].length;
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}