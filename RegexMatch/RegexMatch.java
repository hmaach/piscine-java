

public class RegexMatch {

    public static boolean containsOnlyAlpha(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        return s.matches("^[a-zA-Z]+$");
    }

    public static boolean startWithLetterAndEndWithNumber(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        return s.matches("^[A-Za-z].*\\d$");
    }

    public static boolean containsAtLeast3SuccessiveA(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        return s.matches(".*A{3,}.*");
    }
}
