class Solution {
    public int countGoodSubstrings(String s) {
        List<String>l=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            for(int j=i;j<s.length();j++){
                String substr=s.substring(i,j+1);
                l.add(substr);
            }
        }
        int cnt=0;
        for(int i=0;i<l.size();i++){
            String val=l.get(i);
            if(val.length()==3){
                HashSet<Character>hs=new HashSet<>();
                for(int j=0;j<val.length();j++){
                    hs.add(val.charAt(j));
                }
                if(hs.size()==3){
                    cnt++;
                }
        }
        else{
            continue;
        }
        }
        return cnt;
    }
}