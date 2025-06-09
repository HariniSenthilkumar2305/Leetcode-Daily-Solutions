class Solution {
    public String removeKdigits(String num, int k) {
       if(num.length()==k){
        return "0";
      }
      Stack<Character>a=new Stack<>();
      int n=num.length();
      int i=0;
      while(i<n){
        while(k>0 && !a.isEmpty() && a.peek()>num.charAt(i)){
            a.pop();
            k--;
        }
        a.push(num.charAt(i));
        i++;
      }
      while(k>0){
        a.pop();
        k--;
      }
      StringBuilder res=new StringBuilder();
      while(!a.isEmpty()){
        res.append(a.pop());
      }
      res.reverse();
      while(res.length()>1 && res.charAt(0)=='0'){
        res.deleteCharAt(0);
      }
      return res.toString();
    }
}