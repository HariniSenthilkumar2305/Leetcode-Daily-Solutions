class Solution {
public int jump(int[] nums) {
if(nums.length<=1){
    return 0;
}
int n=0;
int jump=0;
int endofcurrjump=0;
for(int i=0;i<nums.length;i++){
 n=Math.max(n,i+nums[i]);
if(i==endofcurrjump){
jump++;
endofcurrjump=n;
}
if(endofcurrjump>=nums.length-1){
    break;
}
}
return jump;
}
}