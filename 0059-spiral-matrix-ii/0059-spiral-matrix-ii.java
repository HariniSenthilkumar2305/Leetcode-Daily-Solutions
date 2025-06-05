class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        if(n==1){
            mat[0][0]=1;
            return mat;
        }
        int cnt=0;
        int right=n-1;
        int left=0;
        int top=0;
        int bottom=n-1;
        while(top<=bottom && left<=right){//right
            for(int i=left;i<=right;i++){
                cnt+=1;
                mat[top][i]=cnt;
            }
            top++;
            for(int i=top;i<=bottom;i++){//bottom
                cnt+=1;
                mat[i][right]=cnt;
            }
            right--;
            for(int i=right;i>=left;i--){
                cnt+=1;
                mat[bottom][i]=cnt;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                cnt+=1;
                mat[i][left]=cnt;
            }
            left++;
        }
        return mat;
    }
}