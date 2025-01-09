class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
      for(int i=0;i<matrix.length;i++){
        for(int j=i+1;j<matrix.length;j++){
            int temp;
            temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
      }
      for(int i=0;i<n;i++){
        int left=0,right=n-1;
        while(left<right){
            int temp;
            temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
            left++;
            right--;
        }
      }
    }
}