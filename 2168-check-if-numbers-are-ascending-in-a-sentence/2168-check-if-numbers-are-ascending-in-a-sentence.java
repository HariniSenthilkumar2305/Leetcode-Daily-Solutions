class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str=s.split(" ");
        List<Integer>a=new ArrayList<>();
        for(String st:str){
            if(st.matches("\\d+")){
                a.add(Integer.parseInt(st));
            }
        }
        boolean val=true;
        for(int i=1;i<a.size();i++){
            if(a.get(i-1)<a.get(i)){
                val=true;
            }
            else{
                return false;
            }
        }
        return val;
    }
}