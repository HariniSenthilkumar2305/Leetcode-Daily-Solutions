class Solution {
    public boolean checkString(String s) {
       boolean val=true;
       List<Integer>la=new ArrayList<>();
       List<Integer>lb=new ArrayList<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'){
            la.add(i);
        }
        else{
            lb.add(i);
        }
       } 
       Collections.sort(la);
       Collections.sort(lb);
       if(lb.size()>0){
        for(int i=0;i<la.size();i++){
            if(la.get(i)>lb.get(0)){
                return false;
            }
        }
       }
       return val;
    }
}