class Solution {
    public String reverseWords(String s) {
        String[] wordArr = s.trim().split(" ");
        String revWord = "";
        for (int i = wordArr.length - 1; i >= 0; i--)
            if (!wordArr[i].isBlank())
                revWord += wordArr[i].concat(" ");
        return revWord.substring(0, revWord.length() - 1);
    }
}