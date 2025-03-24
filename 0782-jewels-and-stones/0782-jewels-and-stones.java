class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        ArrayList<Character>j=new ArrayList<>();
        ArrayList<Character>s=new ArrayList<>();
        for(int i=0;i<jewels.length();i++){
            j.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++){
            s.add(stones.charAt(i));
        }
        int count=0;
        for(int i=0;i<s.size();i++){
            if(j.contains(s.get(i))){
                count++;
            }
        }
        return count;
    }
}