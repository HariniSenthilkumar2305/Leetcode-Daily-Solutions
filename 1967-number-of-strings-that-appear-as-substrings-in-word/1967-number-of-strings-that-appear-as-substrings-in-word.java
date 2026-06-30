class Solution {
    public int numOfStrings(String[] patterns, String word) {
        ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            for(int j=i;j<word.length();j++){
                String substr=word.substring(i,j+1);
                a.add(substr);
            }
        }
        int cnt=0;
        for(int i=0;i<patterns.length;i++){
            if(a.contains(patterns[i])){
                cnt++;
            }
        }
        return cnt;
    }
}