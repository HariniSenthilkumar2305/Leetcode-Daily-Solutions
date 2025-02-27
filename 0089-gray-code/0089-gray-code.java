class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer>a=new ArrayList<>();
        a.add(0);
        for(int i=0;i<n;i++){
            int val=(int)Math.pow(2,i);
            int size=a.size();
            for(int j=size-1;j>=0;j--){
                a.add(a.get(j)+val);
            }
        }
        return a;
    }
}