class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        List<List<Integer>>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            List<Integer>l=new ArrayList<>();
            for(int j=i;j<arr.length;j++){
                l.add(arr[j]);
                a.add(new ArrayList<>(l));
            }
        }
        int sum=0;
        for(int i=0;i<a.size();i++){
            List<Integer>val=new ArrayList<>(a.get(i));
            if(val.size()%2!=0){
              for(int j=0;j<val.size();j++){
                sum+=val.get(j);
              }
        }
        }
        return sum;
    }
}