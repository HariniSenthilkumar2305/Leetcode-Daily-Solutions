class Solution {
public:
    vector<vector<int>> insert(vector<vector<int>>& intervals, vector<int>& newInterval) {
        intervals.push_back(newInterval);
        int n=intervals.size();
        sort(intervals.begin(),intervals.end());
        vector<vector<int>>a;
        int s=intervals[0][0];
        int e=intervals[0][1];
        for(int i=1;i<n;i++){
            if(e<intervals[i][0]){
                a.push_back({s,e});
                s=intervals[i][0];
                e=intervals[i][1];

            }
            else{
                e=max(e,intervals[i][1]);
            }
        }
        a.push_back({s,e});
        return a;  
    }
};