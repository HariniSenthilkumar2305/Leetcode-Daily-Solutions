class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int result=0;
        int[][] map=new int[10][10];
        for(int i=0;i<dominoes.length;i++){
            int x=Math.min(dominoes[i][0],dominoes[i][1]);
            int y=Math.max(dominoes[i][0],dominoes[i][1]);
            int value=map[x][y];
            result+=value;
            map[x][y]++;
        }
        return result;
    }
}