class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(candidates);
         Combination(candidates,target,result,temp,0);
         return result;
    }
    private void Combination(int[] candidates,int target,List<List<Integer>> result,List<Integer> temp, int start){
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
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            temp.add(candidates[i]);
            Combination(candidates,target,result,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}