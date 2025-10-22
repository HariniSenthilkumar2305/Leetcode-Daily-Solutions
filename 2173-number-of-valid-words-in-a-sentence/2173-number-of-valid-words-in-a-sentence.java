class Solution {
    public boolean containschar(String wr){
        for(int i=0;i<wr.length();i++){
            if(Character.isDigit(wr.charAt(i))){
                return true; // invalid if any digit
            }
        }
        return false;
    }

    public boolean hyphenc(String wd){
        int hyCount = 0;
        for(int i=0;i<wd.length();i++){
            if(wd.charAt(i) == '-'){
                hyCount++;
                // invalid if at start, end, or not surrounded by letters
                if(i == 0 || i == wd.length()-1) return false;
                if(!Character.isLetter(wd.charAt(i-1)) || !Character.isLetter(wd.charAt(i+1))) return false;
            }
        }
        // invalid if more than one hyphen
        return hyCount <= 1;
    }

    public boolean spchar(String wrd){
        for(int i=0;i<wrd.length();i++){
            char ch = wrd.charAt(i);
            if(!Character.isLetterOrDigit(ch) && ch != '-'){
                // allowed only at the end and must be one of ! , .
                if(i == wrd.length()-1 && (ch == '!' || ch == ',' || ch == '.')){
                    continue;
                } else {
                    return true; // invalid special char
                }
            }
        }
        return false;
    }

    public int countValidWords(String sentence) {
        String[] w = sentence.trim().split("\\s+");
        int cnt = 0;
        for(int i = 0; i < w.length; i++){
            if(w[i].length() == 0) continue;
            if(containschar(w[i]) || !hyphenc(w[i]) || spchar(w[i])){
                continue;
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}
