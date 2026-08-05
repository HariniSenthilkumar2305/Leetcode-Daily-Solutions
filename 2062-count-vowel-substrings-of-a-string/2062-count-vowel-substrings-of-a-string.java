class Solution {
    public int countVowelSubstrings(String word) {
        int cnt=0;
        ArrayList<String>a=new ArrayList<>();
        for(int i=0;i<word.length();i++){
            for(int j=i;j<word.length();j++){
                String val=word.substring(i,j+1);
                a.add(val);
            }
        }
        for(int i=0;i<a.size();i++){
            boolean v=true;
            String w=a.get(i);
            boolean hasa=false;
            boolean hase=false;
            boolean hasi=false;
            boolean haso=false;
            boolean hasu=false;
            for(int j=0;j<w.length();j++){
                if(w.charAt(j)!='a' && w.charAt(j)!='e' && w.charAt(j)!='i' && w.charAt(j)!='o' && w.charAt(j)!='u'){
                    v=false;
                    break;
                }
                if(w.charAt(j)=='a'){
                    hasa=true;
                }
                else if(w.charAt(j)=='e'){
                    hase=true;
                }
                else if(w.charAt(j)=='i'){
                    hasi=true;
                }
                else if(w.charAt(j)=='o'){
                    haso=true;
                }
                else if(w.charAt(j)=='u'){
                    hasu=true;
                }
            }
            if(v && hasa && hase && hasi && haso && hasu){
                cnt++;
            }
            
        }
        return cnt;
    }
}