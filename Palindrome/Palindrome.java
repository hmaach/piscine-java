
public class Palindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.toLowerCase().equals(sb.toString().toLowerCase());
    }
}
