class Solution {
    public char repeatedCharacter(String s) {
        char ch='\0';
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                ch=s.charAt(i);
                break;
            }
            freq[s.charAt(i)-'a']++;
        }
        return ch;
    }
}