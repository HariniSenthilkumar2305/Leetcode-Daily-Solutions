class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        HashSet<Integer>hs=new HashSet<>();
        for(Map.Entry<Character,Integer>mp:hm.entrySet()){
            hs.add(mp.getValue());
        }
        if(hs.size()==1){
            return true;
        }
        return false;
    }
}