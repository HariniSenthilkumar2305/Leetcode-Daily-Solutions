class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n=nums.size();
        int l=1,c=1;
        if(n<1)  return n;
        sort(nums.begin(),nums.end());
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                c++;
                l=max(l,c);
            }
            else{
                c=1;
            }
        }
        return l;

    }
};