class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res=new int[r][c];
        ArrayList<Integer>a=new ArrayList<>();
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                a.add(mat[i][j]);
            }
        }
        int l=0;
        while(l<a.size()){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    res[i][j]=a.get(l);
                    l++;
                }
            }
        }
        return res;
    }
}