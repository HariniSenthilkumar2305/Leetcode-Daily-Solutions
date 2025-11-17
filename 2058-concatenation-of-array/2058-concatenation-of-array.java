class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        int[] arr=new int[l.size()];
        for(int i=0;i<l.size();i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}