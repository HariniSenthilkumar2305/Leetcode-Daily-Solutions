import java.util.*;

class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        HashMap<Character, Integer> hp = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            hp.put(chars.charAt(i), hp.getOrDefault(chars.charAt(i), 0) + 1);
        }
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            HashMap<Character, Integer> h = new HashMap<>();
            for (int j = 0; j < w.length(); j++) {
                h.put(w.charAt(j), h.getOrDefault(w.charAt(j), 0) + 1);
            }
            boolean val = true;
            for (Map.Entry<Character, Integer> m : h.entrySet()) {
                if (!hp.containsKey(m.getKey()) || hp.get(m.getKey()) < m.getValue()) {
                    val = false;
                    break;
                }
            }
            if (val) {
                sum += w.length();
            }
        }
        return sum;
    }
}