class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashSet<Integer>a=new HashSet<>();
        int val=0;
        for(int i=0;i<digits.length;i++){
                for(int j=0;j<digits.length;j++){
                  for(int k=0;k<digits.length;k++){
                    if(i!=j && j!=k && k!=i && digits[i]!=0){
                         val=(digits[i]*100)+(digits[j]*10)+digits[k];
                        if(val%2==0){
                            a.add(val);
                        }
                    }
                  }
            }
        }
        List<Integer>resultlist=new ArrayList<>(a);
        Collections.sort(resultlist);
        int[]arr=new int[resultlist.size()];
        for(int i=0;i<a.size();i++){
            arr[i]=resultlist.get(i);
        }
        return arr;
    }
}