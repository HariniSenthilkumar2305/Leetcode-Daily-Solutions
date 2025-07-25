class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int cnt=0;
        for(int i=left;i<=right;i++){
            String val=words[i];
            if((val.charAt(0)=='a'||val.charAt(0)=='e'||val.charAt(0)=='i'|val.charAt(0)=='o'||val.charAt(0)=='u') && (val.charAt(val.length()-1)=='a'||val.charAt(val.length()-1)=='e'||val.charAt(val.length()-1)=='i'|val.charAt(val.length()-1)=='o'||val.charAt(val.length()-1)=='u')){
                cnt++;
            }
        }
        return cnt;
    }
}