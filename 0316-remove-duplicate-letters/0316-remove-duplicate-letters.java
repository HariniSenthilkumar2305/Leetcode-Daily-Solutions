class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26];
        boolean[] added=new boolean[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder a=new StringBuilder();
        for(char ch1:s.toCharArray()){
            char curr=ch1;
            freq[curr-'a']--;
            if(added[curr-'a']){
                continue;
            }
            while(a.length()>0 && curr<a.charAt(a.length()-1) && freq[a.charAt(a.length()-1)-'a']>0){
                    added[a.charAt(a.length()-1)-'a']=false;
                    a.deleteCharAt(a.length()-1);
                }
            a.append(curr);
            added[curr-'a']=true;
        }
        return a.toString();
    }
}