class Solution {
    public String reformatDate(String date) {
      List<String>m=new ArrayList<>();
      m.add("Jan");
      m.add("Feb");
      m.add("Mar");
      m.add("Apr");
      m.add("May");
      m.add("Jun");
      m.add("Jul");
      m.add("Aug");
      m.add("Sep");
      m.add("Oct");
      m.add("Nov");
      m.add("Dec");
      HashMap<String,Integer>mont=new HashMap<>();
      for(int i=0;i<m.size();i++){
        mont.put(m.get(i),i+1);
      }
      String[] dateval=date.split(" ");
      StringBuilder res=new StringBuilder();
      res.append(Integer.parseInt(dateval[2]));
      res.append("-");
      String mm=dateval[1];
      if(mont.get(mm)>=1 && mont.get(mm)<=9){
        res.append("0"+mont.get(mm));
      }
      else{
        res.append(mont.get(mm));
      }
      res.append("-");
      StringBuilder dd=new StringBuilder();
      for(int i=0;i<dateval[0].length();i++){
        if(dateval[0].charAt(i)>='0' && dateval[0].charAt(i)<='9'){
            dd.append(dateval[0].charAt(i));
        }
      }
      String num=dd.toString();
      if(num.length()==1){
        res.append("0"+num);
      }
      else{
        res.append(num);
      }
      return res.toString();
    }
}