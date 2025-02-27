class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> a = new ArrayList<>();
        Arrays.sort(nums);
        a.add(new ArrayList<>()); 

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> temp = new ArrayList<>();

            for (List<Integer> sub : a) {
                List<Integer> newSubset = new ArrayList<>(sub);
                newSubset.add(nums[i]);
                temp.add(newSubset);
            }

            a.addAll(temp);
        }

        return new ArrayList<>(new LinkedHashSet<>(a)); 
    }
}