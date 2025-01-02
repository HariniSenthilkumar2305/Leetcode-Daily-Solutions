class Solution {
public String convert(String s, int numRows) {
        String a="";
        String[] arr=new String[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]="";
        }
        boolean down=false;
        int row=0;
        for(int i=0;i<s.length();i++){
            if(row>=0){
                arr[row]+=s.charAt(i);
            }
            if(row==numRows-1){
                down=false;
            }
            if(row==0){
                down=true;
            }
            if(!down){
                row--;
            }
            else{
                row++;
            }
        }
      for(int i=0;i<s.length();i++){
        a+=arr[i];
      }
      return a;
    }
};