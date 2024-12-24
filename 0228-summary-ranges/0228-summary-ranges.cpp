class Solution {
public:
    vector<string> summaryRanges(vector<int>& nums) {
        int n=nums.size();
        vector<string> s;
        if(nums.empty()) return s;
        int l=nums[0];
        for(int i=1;i<=n;i++){
            if(i==n||nums[i]!=nums[i-1]+1){
                if(l==nums[i-1]){
                    s.push_back(to_string(l));

                }
                else{
                    s.push_back(to_string(l)+"->"+to_string(nums[i-1]));
                }
                if(i<n)  l=nums[i];
            }
        }
        return s;
    }
};