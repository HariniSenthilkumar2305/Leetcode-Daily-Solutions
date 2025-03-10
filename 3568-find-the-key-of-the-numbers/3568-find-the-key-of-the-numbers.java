class Solution {
    public int generateKey(int num1, int num2, int num3) {
     String n1=String.format("%04d",num1);
     String n2=String.format("%04d",num2);
     String n3=String.format("%04d",num3);
     StringBuilder res=new StringBuilder();
     for(int i=0;i<4;i++){
        int minval1=Integer.MAX_VALUE;
        int minval2=Integer.MAX_VALUE;
        minval1=Math.min((Character.getNumericValue(n1.charAt(i))),(Character.getNumericValue(n2.charAt(i))));
        minval2=Math.min((Character.getNumericValue(n3.charAt(i))),minval1);
        res.append(minval2);
     }
     String a=res.toString().replaceFirst("^0+","");
     if(a.isEmpty()){
        a="0";
     }
     return Integer.parseInt(a);
    }
}