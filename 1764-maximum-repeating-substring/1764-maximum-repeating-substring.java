class Solution {
    public int maxRepeating(String sequence, String word) {
        int cnt=0;
        StringBuilder s=new StringBuilder(word);
        while(sequence.contains(s.toString())){
            cnt++;
            s.append(word);
        }
        return cnt;
    }
}