class Solution {

    public String oddString(String[] words) {

        HashMap<String, List<Integer>> mp = new HashMap<>();
        List<List<Integer>> l = new ArrayList<>();

        // Build difference lists
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            List<Integer> a = new ArrayList<>();

            for (int j = 0; j < w.length() - 1; j++) {
                int d = (w.charAt(j + 1) - 'a') - (w.charAt(j) - 'a');
                a.add(d);
            }

            mp.put(w, a);
            l.add(a);
        }

        // Compare each pattern with others
        for (int i = 0; i < l.size(); i++) {

            List<Integer> x = l.get(i);
            boolean val = false;

            for (int j = 0; j < l.size(); j++) {

                if (i != j) {

                    List<Integer> y = l.get(j);

                    val = compareLists(x, y);  // correct comparison

                    if (val)
                        break;
                }
            }

            if (!val) {
                // find which key has this value
                for (String key : mp.keySet()) {
                    if (compareLists(mp.get(key), x)) {
                        return key;
                    }
                }
            }
        }

        return "";
    }

    // Manual list comparison — same logic as yours
    public boolean compareLists(List<Integer> a, List<Integer> b) {

        if (a.size() != b.size()) return false;

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return false;
            }
        }

        return true;
    }
}
