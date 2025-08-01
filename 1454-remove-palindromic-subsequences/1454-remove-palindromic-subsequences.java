class Solution {
    public static boolean palindrome(String a){
        int left=0;
        int right=a.length()-1;
        while(left<=right){
            if(a.charAt(left)!=a.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int removePalindromeSub(String s) {
       if(s.isEmpty())return 0;
       if(palindrome(s))return 1;
       return 2;
    }
}