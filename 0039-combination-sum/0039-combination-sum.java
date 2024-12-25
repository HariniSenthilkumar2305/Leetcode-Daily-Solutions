class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        Combination(candidates,target, result,temp,0);
        return result;
    }
    private void Combination(int[] candidates,int target,List<List<Integer>> result,List<Integer> temp,int start){
        int sum=0;
            for(int i=0;i<temp.size();i++){
                sum+=temp.get(i);
            }
            if(sum==target){
                result.add(new ArrayList<>(temp));
                return;
            }
            if(sum>target){
                return;
            }
        for(int i=start;i<candidates.length;i++){
          temp.add(candidates[i]);
          Combination(candidates,target,result,temp,i);
          temp.remove(temp.size()-1);
        }
    }
}