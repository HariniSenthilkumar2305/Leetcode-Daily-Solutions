class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),i);
            }
            else{
                int fstidx=mp.get(s.charAt(i));
                String substr=s.substring(fstidx+1,i);
                max=Math.max(substr.length(),max);
            }
        }
        return max;
    }
}