class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n=words.length;
        List<String>l=new ArrayList<>();
        int g=-1;
        for(int i=0;i<n;i++){
            if(groups[i]!=g){
                l.add(words[i]);
                g=groups[i];
            }
        }
        return l;
    }
}