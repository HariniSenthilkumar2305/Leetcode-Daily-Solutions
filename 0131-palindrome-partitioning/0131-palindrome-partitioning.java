class Solution {
    public List<List<String>> partition(String s) {
        List<String>current=new ArrayList<>();
        List<List<String>>result=new ArrayList<>();
        backtrack(s,0,current,result);
        return result;
    }
    public void backtrack(String s,int start,List<String>current,List<List<String>>result){
        if(start==s.length()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=start;i<s.length();i++){
            String val=s.substring(start,i+1);
            if(ispalindrome(val)){
                current.add(val);
                backtrack(s,i+1,current,result);
                current.remove(current.size()-1);
            }
        }
    }
    public boolean ispalindrome(String val){
        int left=0;
        int right=val.length()-1;
        while(left<=right){
            if(val.charAt(left++)!=val.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}