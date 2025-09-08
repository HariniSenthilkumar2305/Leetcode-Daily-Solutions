class Solution {
    public List<String> stringMatching(String[] words) {
        List<String>res=new ArrayList<>();
        List<String>l=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            l.add(words[i]);
        }
        for(int i=0;i<words.length;i++){
            String wrd=words[i];
            for(int j=0;j<wrd.length();j++){
                for(int k=j;k<wrd.length();k++){
                    String ispre=wrd.substring(j,k+1);
                    if(ispre!=wrd){
                        if(l.contains(ispre) && !res.contains(ispre)){
                            res.add(ispre);
                        }
                    }
                }
            }
        }
        return res;
    }
}