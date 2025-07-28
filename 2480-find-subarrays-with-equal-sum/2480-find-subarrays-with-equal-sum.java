class Solution {
    public boolean findSubarrays(int[] nums) {
       List<List<Integer>>l=new ArrayList<>();
       for(int i=0;i<nums.length-1;i++){
        List<Integer>a=new ArrayList<>();
        a.add(nums[i]);
        for(int j=i+1;j<=i+1;j++){
            a.add(nums[j]);
        }
        l.add(new ArrayList<>(a));
       }
      List<Integer>c=new ArrayList<>();
      boolean val=false;
      int prevsum=0;
     List<Integer>li=new ArrayList<>(l.get(0));
      for(int i=0;i<li.size();i++){
       prevsum+=li.get(i);
      }
      c.add(prevsum);
      for(int i=1;i<l.size();i++){
        List<Integer>a=new ArrayList<>(l.get(i));
        int sum=0;
        for(int j=0;j<a.size();j++){
            sum+=a.get(j);
        }
        if(c.contains(sum)){
            return true;
        }
        prevsum=sum;
        c.add(prevsum);
      }
      return false;
    }
}