class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Character,Integer>su=new HashMap<>();
        for(int i=0;i<suits.length;i++){
            su.put(suits[i],su.getOrDefault(suits[i],0)+1);
        }
        if(su.size()==1){
            return "Flush";
        }
        else{
            TreeMap<Integer,Integer>mp=new TreeMap<>();
            for(int i=0;i<ranks.length;i++){
                mp.put(ranks[i],mp.getOrDefault(ranks[i],0)+1);
            }
            if(mp.containsValue(2) && mp.containsValue(3)){
                return "Three of a Kind";
            }
            for(Map.Entry<Integer,Integer>b:mp.entrySet()){
                if(b.getValue()>=3){
                    return "Three of a Kind";
                }
                else if(b.getValue()==2){
                    return "Pair";
                }
            }
        }
        return "High Card";
    }
}