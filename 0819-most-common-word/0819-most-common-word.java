class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String v = "";
        ArrayList<String> li = new ArrayList<>();
        for (int i = 0; i < banned.length; i++) {
            li.add(banned[i].toLowerCase());
        }
        String[] val = paragraph.toLowerCase().split("[ !?',;.]+" );
        HashMap<String, Integer> hp = new HashMap<>();
        for (int i = 0; i < val.length; i++) {
            hp.put(val[i], hp.getOrDefault(val[i], 0) + 1);
        }
        int maxlen = 0;
        for (Map.Entry<String, Integer> p : hp.entrySet()) {
            if (!li.contains(p.getKey())) {
                maxlen = Math.max(maxlen, p.getValue());
            }
        }
        for (Map.Entry<String, Integer> m : hp.entrySet()) {
            if (!li.contains(m.getKey()) && m.getValue() == maxlen) {
                v = m.getKey();
            }
        }
        return v;
    }
}