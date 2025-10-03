class Solution {
    public int alternatingSubarray(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();

        // generate all subarrays
        for (int i = 0; i < nums.length - 1; i++) {
            List<Integer> a = new ArrayList<>();
            a.add(nums[i]);
            for (int j = i + 1; j < nums.length; j++) {
                a.add(nums[j]);
                l.add(new ArrayList<>(a)); // FIX: copy, not same reference
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            List<Integer> b = new ArrayList<>(l.get(i));
            boolean valid = true;

            // check alternating condition
            for (int j = 1; j < b.size(); j++) {
                int diff = b.get(j) - b.get(j - 1);
                if (j % 2 != 0) {
                    // odd index: must be +1
                    if (diff != 1) {
                        valid = false;
                        break;
                    }
                } else {
                    // even index: must be -1
                    if (diff != -1) {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid && b.size() > 1) {
                res.add(b);
            }
        }

        int maxlen = -1; // If no alternating subarray found
        for (int i = 0; i < res.size(); i++) {
            List<Integer> w = new ArrayList<>(res.get(i));
            maxlen = Math.max(maxlen, w.size());
        }

        return maxlen;
    }
}
