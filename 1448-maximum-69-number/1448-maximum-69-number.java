class Solution {
    public int maximum69Number (int num) {
      String str=Integer.toString(num);
      int val=0;
      int maxval=num;
      for(int i=0;i<str.length();i++){
        char[] ch=str.toCharArray();
        if(ch[i]=='9'){
            ch[i]='6';
        }
        else if(ch[i]=='6'){
            ch[i]='9';
        }
        int modifiednum=Integer.parseInt(new String(ch));
        val=modifiednum;
        maxval=Math.max(maxval,val);
      }
      return maxval;
    }
}