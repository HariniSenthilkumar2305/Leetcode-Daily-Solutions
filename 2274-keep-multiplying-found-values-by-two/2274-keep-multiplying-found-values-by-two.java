class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        while(a.contains(original)){
            original=original*2;
        }
        return original;
    }
}