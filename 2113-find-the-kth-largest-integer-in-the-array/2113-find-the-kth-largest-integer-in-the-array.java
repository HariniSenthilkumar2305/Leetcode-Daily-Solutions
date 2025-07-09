import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
     int n=nums.length;
     BigInteger[] arr=new BigInteger[nums.length];
     BigInteger[] arr1=new BigInteger[nums.length];
     int idx=0;
     for(int i=0;i<nums.length;i++){
        BigInteger res=BigInteger.ZERO;
        int stridx=0;
        int sign=1;
        if(nums[i].charAt(0)=='-'){
            sign=-1;
            stridx=1;
        }
        for(int j=stridx;j<nums[i].length();j++){
            char digit=nums[i].charAt(j);
            if(digit>='0' && digit<='9'){
                int di=digit-'0';
                res=res.multiply(BigInteger.TEN).add(BigInteger.valueOf(di));
            }
        }
        if(sign==-1){
            res=res.negate();
        }
        arr[i]=res;
     }   
     Arrays.sort(arr);
     for(int i=nums.length-1;i>=0;i--){
        arr1[idx++]=arr[i];
     } 
     return String.valueOf(arr1[k-1]);
    }
}