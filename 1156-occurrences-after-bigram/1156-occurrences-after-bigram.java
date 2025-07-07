class Solution {
    public String[] findOcurrences(String text, String first, String second) {
       String[] str=text.split(" ");
       List<String>a=new ArrayList<>();
       for(int i=0;i<str.length-2;i++){
        if(str[i].equals(first) && str[i+1].equals(second)){
            a.add(str[i+2]);
        }
       }
       String[] res=new String[a.size()];
       for(int i=0;i<a.size();i++){
        res[i]=a.get(i);
       }
       return res; 
    }
}