class Solution {
    public int maxNumberOfBalloons(String text) {
        String s="balloon";
        HashMap<Character,Integer>mp1=new HashMap<>();
        HashMap<Character,Integer>mp2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp1.put(s.charAt(i),mp1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<text.length();i++){
            if(mp1.containsKey(text.charAt(i))){
                mp2.put(text.charAt(i),mp2.getOrDefault(text.charAt(i),0)+1);
            }
        }
        int min=Integer.MAX_VALUE;
        for(char ch:mp1.keySet()){
            int required=mp1.get(ch);
            int available=mp2.getOrDefault(ch,0);
            min=Math.min(min,available/required);
        }
        return min;
    }
}