class Solution {
    public String longestWord(String[] words) {
       HashMap<String,Integer>st=new HashMap<>();
       for(int i=0;i<words.length;i++){
        st.put(words[i],words[i].length());
       }
       String[] st1=new String[st.size()]; 
       int[] ar=new int[st.size()];
       int idx=0;
       int idx1=0;
       for(Map.Entry<String,Integer>b:st.entrySet()){
        st1[idx++]=b.getKey();
        ar[idx1++]=b.getValue();
       }
       for(int i=0;i<ar.length;i++){
        for(int j=i+1;j<ar.length;j++){
            if(ar[i]<ar[j]){
                String temp=st1[i];
                st1[i]=st1[j];
                st1[j]=temp;
                int tempval=ar[i];
                ar[i]=ar[j];
                ar[j]=tempval;
            }
        }
       }
       TreeSet<String>str=new TreeSet<>();
       String res="";
       for(int k=0;k<st1.length;k++){
        String word=st1[k];
        boolean iscon=true;
        for(int i=1;i<=word.length();i++){
                String subword=word.substring(0,i);
                if(!st.containsKey(subword) && i!=word.length()){
                    iscon=false;
                    break;
                }
        }
        if(iscon){
                str.add(word);
        }
       }
       int max=0;
      for(String val:str){
        if(val.length()>max)
        {
            max=val.length();
            res=val;
        }
      }
      return res;
    }
}