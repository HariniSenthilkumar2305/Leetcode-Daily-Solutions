class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String wthoutsp=licensePlate.replaceAll("\\s","");
        String w=wthoutsp.replaceAll("\\d","").toLowerCase();
        HashMap<Character,Integer>mp=new HashMap<>();
        for(int i=0;i<w.length();i++){
            mp.put(w.charAt(i),mp.getOrDefault(w.charAt(i),0)+1);
        }
        int minlen=Integer.MAX_VALUE;
        String res="";
        for(int i=0;i<words.length;i++){
            boolean iscon=false;
            HashMap<Character,Integer>ew=new HashMap<>();
            for(int j=0;j<words[i].length();j++){
                ew.put(words[i].charAt(j),ew.getOrDefault(words[i].charAt(j),0)+1);
            }
            for(Map.Entry<Character,Integer>b:mp.entrySet()){
                if(ew.containsKey(b.getKey())){
                    if(b.getValue()<=ew.get(b.getKey())){
                        iscon=true;
                    }
                    else{
                        iscon=false;
                        break;
                    }
                }
                else{
                    iscon=false;
                    break;
                }
            }
            if(iscon){
                if(words[i].length()<minlen){
                    res=words[i];
                    minlen=words[i].length();
                }
            }
        }
        return res;
    }
}