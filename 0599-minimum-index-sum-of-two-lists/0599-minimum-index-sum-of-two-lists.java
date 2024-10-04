class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
       List<String> res=new ArrayList<>();
       int i,j;
       int minsum=Integer.MAX_VALUE;
      for(i=0;i<list1.length;i++){
        for(j=0;j<list2.length;j++){
            if(list1[i].equals(list2[j])){
                int sum=i+j;
               if(sum<minsum){
                res.clear();
                res.add(list1[i]);
                minsum=sum;
               }
               else if(sum==minsum){
                res.add(list1[i]);
               }
            }
        }
      }
     return res.toArray(new String[res.size()]);
    }
}