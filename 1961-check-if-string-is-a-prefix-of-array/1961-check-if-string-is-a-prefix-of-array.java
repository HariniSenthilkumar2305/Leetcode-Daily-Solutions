class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            String val=sb.toString();
            if(s.equals(val)){
                return true;
            }
        }
        return false;
    }
}