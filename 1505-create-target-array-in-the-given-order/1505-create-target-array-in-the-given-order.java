class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len=nums.length;
        int[] tar=new int[len];
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<len;i++){
           l.add(index[i],nums[i]);
        }
         for(int i=0;i<len;i++){
           tar[i]=l.get(i);
        }
        return tar; 
    }
}