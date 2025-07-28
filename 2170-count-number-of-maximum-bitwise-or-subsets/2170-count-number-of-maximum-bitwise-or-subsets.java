class Solution {
    public int countMaxOrSubsets(int[] nums) {
        List<List<Integer>>b=new ArrayList<>();
        b.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
           int size=b.size();
            for(int j=0;j<size;j++){
                List<Integer>newseq=new ArrayList<>(b.get(j));
                newseq.add(nums[i]);
                b.add(newseq);
            }
        }
        int maxxor=0;
        for(int i=0;i<b.size();i++){
            List<Integer>l=new ArrayList<>(b.get(i));
            int xorval=0;
            for(int j=0;j<l.size();j++){
                xorval=xorval|l.get(j);
            }
            if(xorval>=maxxor){
                maxxor=xorval;
            }
        }
        int cnt=0;
         for(int i=0;i<b.size();i++){
            List<Integer>l=new ArrayList<>(b.get(i));
            int xorval=0;
            for(int j=0;j<l.size();j++){
                xorval=xorval|l.get(j);
            }
            if(xorval==maxxor){
                cnt++;
            }
        }
        return cnt;
    }
}