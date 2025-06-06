class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> valtoremove=new ArrayList<>();
         List<Integer>b=new ArrayList<>();
        for(int i=1;i<words.length;i++){
            if(isanagram(words[i-1],words[i])){
                valtoremove.add(words[i]);
                b.add(i);
            }
        }
        List<String>res=new ArrayList<>();
        for(int i=0;i<words.length;i++){
              if(!b.contains(i)){
                res.add(words[i]);
              }
         }
         return res;
        }
    public static boolean isanagram(String a,String b){
        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
}