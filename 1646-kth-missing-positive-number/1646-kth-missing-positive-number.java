class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer>a=new ArrayList<>();
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        int i=1;
       while(res.size()<=k+1){
        if(!a.contains(i)){
            res.add(i);
        }
        i++;
       }
        if(res.size()>=k){
        return res.get(k-1);
        }
        return 0;
    }
}