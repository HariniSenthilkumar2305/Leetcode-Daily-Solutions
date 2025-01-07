class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            HashSet<Character>a=new HashSet<>();
            for(int j=0;j<board.length;j++){
                char current=board[i][j];
               if(current!='.' && !a.add(current)){
                return false;
               }
            }
        }
       for(int j=0;j<board[0].length;j++){
         HashSet<Character>a=new HashSet<>();
         for(int i=0;i<board.length;i++){
            char current=board[i][j];
            if(current!='.' && !a.add(current)){
                return false;
            }
         }
       }
       for(int row=0;row<3;row++){
        for(int col=0;col<3;col++){
           HashSet<Character>a=new HashSet<>();
           for(int i=row*3;i<row*3+3;i++){
            for(int j=col*3;j<col*3+3;j++){
                char current=board[i][j];
                if(current!='.' && !a.add(current)){
                    return false;
                }
            }
           }
        }
       }
       return true;
    }
}