class Solution {
    public int findKthPositive(int[] arr, int k) {
        int val=0;
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
        }
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=1;i<=10000;i++){
            if(!a.contains(i)){
                a1.add(i);
            }
        }
        for(int i=0;i<a1.size();i++){
            if(i==k-1){
                val=a1.get(i);
                break;
            }
        }
        return val;
    }
}