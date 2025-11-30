class Solution {
    public int countPrefixes(String[] words, String s) {
        List<String>l=new ArrayList<>();
        for(int i=1;i<=s.length();i++){
            String substr=s.substring(0,i);
            l.add(substr);
        }
        int cnt=0;
        for(int i=0;i<words.length;i++){
            if(l.contains(words[i])){
                cnt++;
            }
        }
        return cnt;
    }
}