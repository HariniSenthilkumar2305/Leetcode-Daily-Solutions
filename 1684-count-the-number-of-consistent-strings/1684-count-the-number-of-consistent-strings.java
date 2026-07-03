class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        ArrayList<Character>l=new ArrayList<>();
        for(int i=0;i<allowed.length();i++){
            l.add(allowed.charAt(i));
        }
        int cnt=0;
        for(int i=0;i<words.length;i++){
            boolean v=true;
            String w=words[i];
            for(int j=0;j<w.length();j++){
                if(!l.contains(w.charAt(j))){
                    v=false;
                    break;
                }
            }
            if(v){
                cnt++;
            }
        }
        return cnt;
    }
}