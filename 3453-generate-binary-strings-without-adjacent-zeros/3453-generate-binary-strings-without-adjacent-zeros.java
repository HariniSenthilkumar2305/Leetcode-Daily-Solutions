import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generateStringHelper(n, "", result);
        return result;
    }

    private static void generateStringHelper(int n, String current, List<String> result) {
       
        if (current.length() == n) {
            result.add(current);
            return;
        }
        if (current.isEmpty() || current.charAt(current.length() - 1) != '0') {
            generateStringHelper(n, current + "0", result);
        }
        generateStringHelper(n, current + "1", result);
    }
}
