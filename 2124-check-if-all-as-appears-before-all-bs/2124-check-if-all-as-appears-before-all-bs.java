class Solution {
    public boolean checkString(String s) {
       ArrayList<Integer>hsa=new ArrayList<>();
       ArrayList<Integer>hsb=new ArrayList<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'){
            hsa.add(i);
        }
        else{
            hsb.add(i);
        }
       }
       Collections.sort(hsa);
       Collections.sort(hsb);
       if(hsa.size()>0 && hsb.size()>0){
        if(hsa.get(hsa.size()-1)>hsb.get(0)){
            return false;
        }
       }
       return true;
    }
}