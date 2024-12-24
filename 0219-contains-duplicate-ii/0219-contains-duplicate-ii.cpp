class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        map<int,int>a;
        for(int i=0;i<nums.size();i++){
            if(a.count(nums[i])){
                if(abs(i-a[nums[i]])<=k){
                    return true;
                }
                
            }
            a[nums[i]]=i;
            
        }
        return false;

        
    }
};