import java.util.*;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int arr[] = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> col = new HashMap<>();
        int diff = 0;

        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if (!map.containsKey(ball)) {
                map.put(ball, color);
                col.put(color, col.getOrDefault(color, 0) + 1);
                if (col.get(color) == 1) {
                    diff++;
                }
            } else {
                int oldcol = map.get(ball);
                if (oldcol != color) {
                    col.put(oldcol, col.get(oldcol) - 1);
                    if (col.get(oldcol) == 0) {
                        diff--;
                    }
                    map.put(ball, color);
                    col.put(color, col.getOrDefault(color, 0) + 1);
                    if (col.get(color) == 1) {
                        diff++;
                    }
                }
            }
            arr[i] = diff;
        }
        return arr;
    }
}
