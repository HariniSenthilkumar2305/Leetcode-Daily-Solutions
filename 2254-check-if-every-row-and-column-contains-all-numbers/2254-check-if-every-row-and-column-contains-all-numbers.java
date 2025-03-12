class Solution {
    public boolean checkValid(int[][] matrix) {
        List<Integer>a=new ArrayList<>();
        for(int i=1;i<=matrix.length;i++){
            a.add(i);
        }
        for(int i=0;i<matrix.length;i++){
         HashMap<Integer,Integer>rowmap=new HashMap<>();
          HashMap<Integer,Integer>colmap=new HashMap<>();
            for(int j=0;j<matrix.length;j++){
                rowmap.put(matrix[i][j],rowmap.getOrDefault(matrix[i][j],0)+1);
                colmap.put(matrix[j][i],colmap.getOrDefault(matrix[j][i],0)+1);
            }
            for(Map.Entry<Integer,Integer>b:rowmap.entrySet()){
                if(b.getValue()>1){
                    return false;
                }
            }
            for(int num:a){
                if(!rowmap.containsKey(num)){
                    return false;
                }
            }
              for(Map.Entry<Integer,Integer>b:colmap.entrySet()){
                if(b.getValue()>1){
                    return false;
                }
            }
            for(int num:a){
                if(!colmap.containsKey(num)){
                    return false;
                }
            }
        }
        return true;
    }
}