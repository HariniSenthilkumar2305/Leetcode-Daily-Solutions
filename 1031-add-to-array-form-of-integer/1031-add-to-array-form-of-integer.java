import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        StringBuilder a = new StringBuilder();

        for (int i = 0; i < num.length; i++) {
            a.append(num[i]);
        }

        BigInteger bigNum = new BigInteger(a.toString());
        BigInteger sum = bigNum.add(BigInteger.valueOf(k));

        String sumStr = sum.toString();
        for (char ch : sumStr.toCharArray()) {
            res.add(ch - '0');
        }

        return res;
    }
}
