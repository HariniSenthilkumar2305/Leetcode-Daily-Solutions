class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        permutations(nums,result,temp,visited);
        return result;
    }
    private void permutations(int[] nums,List<List<Integer>>  result,List<Integer>temp,boolean[] visited){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i] || (i>0 && nums[i]==nums[i-1] && !visited[i-1])){
                continue;
            }
            temp.add(nums[i]);
            visited[i]=true;
            permutations(nums,result,temp,visited);
            temp.remove(temp.size()-1);
            visited[i]=false;
        }
    }
}